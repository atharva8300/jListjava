import java.awt.*;
import java.awt.event.*;
import java.util.Iterator;
import javax.swing.JOptionPane;
import javax.swing.*;
import javax.swing.JFrame ;
public class Menu1 extends Frame
{
private static String[] foods = {"pavbhaji","bhel","panipuri","paneer","sandwich","chai","cabbage","flower","rice"};
private static float[]price={100,30,30,30,60,25,20,10,20};
int amount =0;
Menu1()
{
super("miniproject");
Button b=new Button("place order-->");
b.setBounds(100,600,80,30);
add(b);
List l1=new List(4);
List l2=new List();
l1.setBounds(100,100,80,80);
for(int i=0;i<foods.length;i++)
l1.add(foods[i]);
add(l1);
l1.setMultipleMode(true);
b.addActionListener(
new ActionListener() {
	public void actionPerformed(ActionEvent event) {
		
		String other[]=new String[10];
		other=l1.getSelectedItems();
		JOptionPane.showMessageDialog(null,other,"selected food",JOptionPane.PLAIN_MESSAGE);
			for(int k=0;k<other.length;k++) {
			if(l1.isIndexSelected(k)){
			for(int j=0;j<price.length;j++) { if(other[k].equals(foods[j]))
			amount+=price[j]; }
		
		} } 

JOptionPane.showMessageDialog(null,amount,"bill",JOptionPane.PLAIN_MESSAGE);amount=0;
		}
	}
);
}
public static void main(String args[])
{
JFrame f=new JFrame(); 
Menu1 m=new Menu1();
m.setSize(700,700);
m.setLayout(null);
m.setVisible(true);
}
}