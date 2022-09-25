import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import javax.swing.tree.*;
import javax.swing.event.*;

public class Recipie extends Ingredients{
	private JFrame frame;
	private GridBagConstraints c;
	private JPanel panel;
	public Recipie(){
		frame = new JFrame();
		panel = new JPanel();

		String[] types = {"Snacks","Desserts","Rice items","Drinks"};
		DefaultMutableTreeNode recipies = new DefaultMutableTreeNode("Recipies");
		DefaultMutableTreeNode nodes[] = new DefaultMutableTreeNode[4];
		for(int i=0;i<4;i++){
			nodes[i] = new DefaultMutableTreeNode(types[i]);
			recipies.add(nodes[i]);
		}
		String[] snacks = {"Goli Bajji","Amaranth Bathua Duet With Turmeric Foam","Egg Hakka Noodles","Kulle Ki Chaat","Chocolate Chip Cookies","Gulab Badam Chikki","Christmas Cookies",};
		String[] desserts = {"Halwa With Vanilla Ice Cream","Kalakand","Almond And Rose Kheer","Besan Ke Laddoo","Red Velvet Pastry","Kimami Sewaiyan","Thandai Barfi","Badam Aur Gulkand Ki Kulfi"};
		String[] rice = {"Sakkarai Pongal","Chocolate Appo","Bamboo Biryani","Murgh Biryani","Veg Fried Rice","Green Coriander Rice","Vegetable Biryani"};
		String[] drinks = {"Turmeric Masala Milk","Cucumber, Kale And Spinach Juice","orange juice","Thandai Phirni","Mango Margarita","Almond Milk Thandai","Expresso"};
		
		for(int i=0;i<snacks.length;i++){
			nodes[0].add(new DefaultMutableTreeNode(snacks[i]));
		}
		for(int i=0;i<desserts.length;i++){
			nodes[1].add(new DefaultMutableTreeNode(desserts[i]));
		}
		for(int i=0;i<rice.length;i++){
			nodes[2].add(new DefaultMutableTreeNode(rice[i]));
		}
		for(int i=0;i<drinks.length;i++){
			nodes[3].add(new DefaultMutableTreeNode(drinks[i]));
		}			
		
		frame.setLayout(new GridLayout());
		
		JTree t = new JTree(recipies);
		frame.add(t);
		frame.add(new JScrollPane(t,ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS));	
		
		panel.setLayout(new GridBagLayout());
		c = new GridBagConstraints();
		c.anchor = GridBagConstraints.CENTER;
		c.fill = GridBagConstraints.BOTH;
		c.gridx=0;
		c.gridy=0;
		JTextArea a = new JTextArea();
		panel.add(a,c);

		c.gridx=0;
		c.gridy=10;
		JButton b = new JButton("submit");
		panel.add(b,c);
		frame.add(panel);
		
		JTextArea a1 = new JTextArea();
		frame.add(a1);
		
		t.getSelectionModel().addTreeSelectionListener(new TreeSelectionListener(){
			public void valueChanged(TreeSelectionEvent e){
				DefaultMutableTreeNode selectedNode = (DefaultMutableTreeNode)t.getLastSelectedPathComponent();
				a.setText("Kindly enter the ingredients if not present in our menu");
				a.append("\n\n"+ingre(selectedNode.getUserObject().toString()));
				b.addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent ae){
						String input = ae.getActionCommand();
						if(input.equals("submit")){
								a1.setText(replacement(a.getText()));
						}
					}
				});
			}
		});		

		frame.pack();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args){
		new Recipie();
	}
}