import java.awt.*;
import java.awt.event.*;
//import java.util.*;
import java.util.Iterator;

import javax.swing.*;
public class Menu1 extends JFrame
{
private static String foods[] = {"pavbhaji","bhel","panipuri","paneer","sandwich","chai","cabbage","flower","rice"};
private static float[] price={100,30,30,30,60,25,20,10,20};
private static String other[]=new String[10];
private static float cost[]={80,120,95,40,37,60,60,40,50,60,30,30,30,30,100,80,80};
private static String[] food={"veg crispy",
"hakka noodles",
"american choupsey",
"cheese paratha",
"paneer paratha",
"cheese pakoda",
"paneer pakoda",
"sandwich",
"cheese sandwich",
"grilled sandwich",
"chineese bhej",
"mosambi juice",
"watermelon juice",
"strawberry juice",
"falooda",
"icecream(any)",
"softdrinks(any)"
};
int amount =0;
int amount1=0;
Menu1()
{
super("miniproject");
//JLabel label = new JLabel("WELCOME");
JLabel L1 ;

//label.setText("WELCOME");
//label.setFont(new Font("Courier New", Font.ITALIC, 17));
//label.setBounds(200,100,100,100);
//add(label);
setLayout(new FlowLayout());
L1 = new JLabel() ;
setContentPane(new JLabel(new ImageIcon("chef8 .jpg")));
add(L1);
setLocationRelativeTo(null);
//setLocationRelativeTo(null);
setSize(20,20);
JButton start=new JButton("START");
start.setBounds(200,150,80,20);
add(start);
start.addActionListener(
new ActionListener() {
public void actionPerformed(ActionEvent a) {
//add(Graphics.drawLine(200,30,80,30));
dispose();
JFrame j=new JFrame("starters");
JLabel L22 ;
j.setContentPane(new JLabel(new ImageIcon("starter .JPG")));
j.setLayout(new FlowLayout());
L22 = new JLabel() ;
j.add(L22);
//setLocationRelativeTo(null);
setSize(20,20);
List l1=new List(4);
List l2=new List();
setLayout(new FlowLayout());
l1.setBounds(100,100,80,80);
for(int i=0;i<foods.length;i++)
l1.add(foods[i]);
j.add(l1);
l1.setMultipleMode(true);
j.setSize(500,300);
j.setLayout(new FlowLayout());
j.setVisible(true);

j.setLocationRelativeTo(null);
JButton b=new JButton("placeorder");
b.setBounds(300,150,80,30);
j.add(b);
JButton b1=new JButton("MainCourse");
b1.setBounds(100,200,80,30);
j.add(b1);
b.addActionListener(
new ActionListener() {
public void actionPerformed(ActionEvent event) {
//String other[]=new String[27];
other=l1.getSelectedItems();
JOptionPane.showMessageDialog(null,other,"selected food",JOptionPane.PLAIN_MESSAGE);
for(int k=0;k<other.length;k++) {
for(int j=0;j<price.length;j++) { if(other[k].equals(foods[j]))
amount+=price[j]; }

 }

JOptionPane.showMessageDialog(null,amount,"bill",JOptionPane.PLAIN_MESSAGE);amount=0; }

}
);

b1.addActionListener(
new ActionListener() {
public void actionPerformed(ActionEvent ev){
JFrame f=new JFrame("main course");
JLabel L33 ;
f.setContentPane(new JLabel(new ImageIcon("maincourse.JPG")));
f.setLayout(new FlowLayout());
L33 = new JLabel() ;
f.add(L33);

setSize(20,20);
List l3=new List(5);
for(int i=0;i<food.length;i++)
l3.add(food[i]);
l3.setBounds(100,100,80,80);
l3.setMultipleMode(true);
f.setLayout(new FlowLayout());
f.setSize(500,300);
f.setVisible(true);
f.add(l3);
f.setLocationRelativeTo(null);
JButton b3=new JButton("placeorder");
b3.addActionListener(
new ActionListener() {
public void actionPerformed(ActionEvent event) {
String other1[]=new String[27];
other1=l3.getSelectedItems();
/*for(int i=other1.length+1;i<(other.length+other1.length);i++)
{for(int j=0;j<other.length;j++)
{
other1[i].replace(0,10,other[j]);
}} */ 
JOptionPane.showMessageDialog(null,other1,"selected food",JOptionPane.PLAIN_MESSAGE);
for(int k=0;k<other1.length;k++) {
for(int j=0;j<cost.length;j++) { if(other1[k].equals(food[j]))
amount+=cost[j]; }

 }

JOptionPane.showMessageDialog(null,amount,"bill",JOptionPane.PLAIN_MESSAGE);amount=0; }

}
);
JButton prev=new JButton("starters");
prev.setBounds(100,300,80,30);
b3.setBounds(100,200,80,30);
f.add(b3);
f.add(prev);
prev.addActionListener(
new ActionListener() {
public void actionPerformed(ActionEvent event) {
f.dispose();
}
});
}
}
);
}
} );
}
}
