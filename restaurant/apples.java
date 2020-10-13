import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.JOptionPane;
class apples extends JFrame
{
	int i;
	public apples()
	{
		JFrame z=new JFrame();
		z.setLayout(new FlowLayout());
		JButton p1=new JButton("Enter as admin");
		JButton p2=new JButton("Enter as online user");
		z.setLocationRelativeTo(null);
		p1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
			//setLocationRelativeTo(null);
			//z.dispose();
			Menu1 m=new Menu1();
			m.setSize(500,300);
			m.setLayout(null);
			m.setVisible(true);
			}
		});
		p2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
			z.dispose();
			menu mu=new menu();
			mu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			mu.setSize(10000,10000);
			mu.setVisible(true);	
			}
		});
		z.add(p1);
		z.add(p2);
		z.setSize(200,200);
		z.setVisible(true);
	}
public static void main(String args[])
{
apples a=new apples();
}
}
