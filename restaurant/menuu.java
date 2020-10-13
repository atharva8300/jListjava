import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.JOptionPane;
public class menu extends JFrame
{
	public int sum=0;
	public String s;
	private JCheckBox Tomato_Soup;
	private JCheckBox Vegan_Soup;
	private JCheckBox Paneer_Tikka;
	private JCheckBox Cheese_Balls;
	private JCheckBox Pav_Bhaji;
	private JCheckBox Fried_Rice;
	private JCheckBox Icecream_sundae;
	private JCheckBox Sizzling_Brownie;
	
	public menu()
	{
		super("MENU");
		setLayout(new BorderLayout());
		setContentPane(new JLabel(new ImageIcon("bg.png")));
		getContentPane().setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
		Tomato_Soup=new JCheckBox("1.TOMATO SOUP     Rs150");
		Vegan_Soup=new JCheckBox("2.VEGAN SOUP       Rs200");
		 Paneer_Tikka=new JCheckBox("3.PANEER TIKKA      Rs280"); 
		 Cheese_Balls=new JCheckBox("4.CHEESE BALLS      Rs300");
		Pav_Bhaji=new JCheckBox("5.PAV BHAJI         Rs250");
		Fried_Rice=new JCheckBox("6.FRIED RICE       Rs260");
		Icecream_sundae=new JCheckBox("7.ICECREAM SUNDAE  Rs350");
		Sizzling_Brownie=new JCheckBox("8.DONUT      Rs380");
		add(Tomato_Soup);
		JButton ts=new JButton("Click for description", new ImageIcon("ts.png"));     	
		add(ts);
		JLabel lts=new JLabel();
		add(lts);
		add(Vegan_Soup);
		JButton vs=new JButton("Click for description", new ImageIcon("vs.png"));     	
		add(vs);
		JLabel lvs=new JLabel();
		add(lvs);
		add(Paneer_Tikka);
		JButton pk=new JButton("Click for description", new ImageIcon("pk.png"));     	
		add(pk);
		JLabel lpk=new JLabel();
		add(lpk);
		add(Cheese_Balls);
		JButton cb=new JButton("Click for description", new ImageIcon("cb.png"));     	
		add(cb);
		JLabel lcb=new JLabel();
		add(lcb);
		add(Pav_Bhaji);
		JButton pb=new JButton("Click for description", new ImageIcon("pb.png"));     	
		add(pb);
		JLabel lpb=new JLabel();
		add(lpb);
		add(Fried_Rice);
		JButton fr=new JButton("Click for description", new ImageIcon("fr.png"));     	
		add(fr);
		JLabel lfr=new JLabel();
		add(lfr);
		add(Icecream_sundae);
		JButton is=new JButton("Click for description", new ImageIcon("is.png"));     	
		add(is);
		JLabel lis=new JLabel();
		add(lis);
		add(Sizzling_Brownie);
		JButton sb=new JButton("Click for description", new ImageIcon("sb.png"));     	
		add(sb);
		JLabel lsb=new JLabel();
		add(lsb);
		Menuclass m=new Menuclass();
		Tomato_Soup.addItemListener(m);
		Vegan_Soup.addItemListener(m);
		Paneer_Tikka.addItemListener(m);
		Cheese_Balls.addItemListener(m);
		Pav_Bhaji.addItemListener(m);
		Fried_Rice.addItemListener(m);
		Icecream_sundae.addItemListener(m);
		Sizzling_Brownie.addItemListener(m);
		ts.addActionListener(new ActionListener() {
	        
			@Override
			public void actionPerformed(ActionEvent arg0) {
					lts.setFont(new Font("Times Roman",Font.ITALIC,12));
					lts.setText("Ultimate comfort food. Ripe tomatoes and creamy texture gives your meal a perfect start.");				
			}          
	      });
		vs.addActionListener(new ActionListener() {
	        
			@Override
			public void actionPerformed(ActionEvent arg0) {
					lvs.setFont(new Font("Times Roman",Font.ITALIC,12));
					lvs.setText("The base for this lovely, everyday soup starts with hearty vegetables for plenty of plant-based fiber and flavor with carrots, celery, kale, potatoes, garlic and onion. Something that doesn't makes compromise on health or taste. ");				
			}          
	      });
		pk.addActionListener(new ActionListener() {
	        
			@Override
			public void actionPerformed(ActionEvent arg0) {
					lpk.setFont(new Font("Times Roman",Font.ITALIC,12));
					lpk.setText("Delicious chunks of paneer marinated in spices and grilled in a tandoor. ");				
			}          
	      });
		cb.addActionListener(new ActionListener() {
	        
			@Override
			public void actionPerformed(ActionEvent arg0) {
					lcb.setFont(new Font("Times Roman",Font.ITALIC,12));
					lcb.setText("Yummy treat for the Kids, made with Boiled Potatoes and Spices and stuffed with the filling of Grated Processed Cheese.");				
			}          
	      });
		pb.addActionListener(new ActionListener() {
	        
			@Override
			public void actionPerformed(ActionEvent arg0) {
					lpb.setFont(new Font("Times Roman",Font.ITALIC,12));
					lpb.setText(" Thick vegetable curry served with a soft buttery bread rolls.");
			}          
	      });
		fr.addActionListener(new ActionListener() {
	        
			@Override
			public void actionPerformed(ActionEvent arg0) {
					lfr.setFont(new Font("Times Roman",Font.ITALIC,12));
					lfr.setText("Rice stir-fried in a wok with scrambled eggs, onions, carrots, green peas and your choice of meat or seafood.");
			}          
	      });
		is.addActionListener(new ActionListener() {
	        
			@Override
			public void actionPerformed(ActionEvent arg0) {
					lis.setFont(new Font("Times Roman",Font.ITALIC,12));
					lis.setText("Frozen delicacies served in your choice of flvours,combinations and toppings.");			
			}          
	      });
		sb.addActionListener(new ActionListener() {
	        
			@Override
			public void actionPerformed(ActionEvent arg0) {
					lsb.setFont(new Font("Times Roman",Font.ITALIC,12));
					lsb.setText("Fresh hot O-shaped buns with chocolate filing and sprinklers.");			
			}          
	      });
 		JButton po=new JButton("Place order->");
		add(po);
		po.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e){
			JFrame k=new JFrame();
			 JOptionPane.showMessageDialog(k,"Total Bill: "+sum);}
		});
	}
	private class Menuclass implements ItemListener
	{
		public void itemStateChanged(ItemEvent event)
		{
			JCheckBox checkbox=(JCheckBox)event.getSource();
			if(checkbox.isSelected())
			{
				
				if(checkbox==Tomato_Soup)
				{
					sum=sum+150;
				}
				else if(checkbox==Vegan_Soup)
				{
					sum=sum+200;
				}
				else if(checkbox==Paneer_Tikka)
				{
					sum=sum+280;
				}
				else if(checkbox==Cheese_Balls)
				{
					sum=sum+300;
				}
				else if(checkbox==Pav_Bhaji)
				{
					sum=sum+250;
				}
				else if(checkbox==Fried_Rice)
				{
					sum=sum+260;
				}
				else if(checkbox==Icecream_sundae)
				{
					sum=sum+350;
				}
				else if(checkbox==Sizzling_Brownie)
				{
					sum=sum+380;
				}
				
			}
			else
			{
				if(checkbox==Tomato_Soup)
				{
					sum=sum-150;
				}
				else if(checkbox==Vegan_Soup)
				{
					sum=sum-200;
				}
				else if(checkbox==Paneer_Tikka)
				{
					sum=sum-280;
				}
				else if(checkbox==Cheese_Balls)
				{
					sum=sum-300;
				}
				else if(checkbox==Pav_Bhaji)
				{
					sum=sum-250;
				}
				else if(checkbox==Fried_Rice)
				{
					sum=sum-260;
				}
				else if(checkbox==Icecream_sundae)
				{
					sum=sum-350;
				}
				else if(checkbox==Sizzling_Brownie)
				{
					sum=sum-380;
				}
			}
		}
	}
}
