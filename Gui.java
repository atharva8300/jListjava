import java.awt.* ;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.* ;
public class Gui extends JFrame{
	private JList menu ;
	private JList rightlist ;
	private JButton movebutton;
	private static String[] foods = {"pavbhaji","bhel","panipuri","paneer","sandwitch","chai","cabbage","flower","rice"};
	
	
	public Gui() {
		super("miniproject");
		setLayout(new FlowLayout());
		
		menu = new JList(foods);
		menu.setVisibleRowCount(5);
		menu.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		add(new JScrollPane(menu));
		
		movebutton = new JButton("order--->");
		movebutton.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent event) {
						rightlist.setListData(menu.getSelectedValuesList().toArray());
					}
				}
		);
		add(movebutton);
		
		rightlist = new JList();
		rightlist.setVisibleRowCount(3);
		rightlist.setFixedCellWidth(70);
		rightlist.setFixedCellHeight(30);
		
		rightlist.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		add(new JScrollPane(rightlist));
	}
}
