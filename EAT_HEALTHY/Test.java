import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class First  {
	private final GridBagLayout layout;
	private GridBagConstraints c;
	private JLabel label1;
	private JFrame frame1;
	private JButton button;
	private JPanel panel1;
	private JTextField field;
	public First() {
		frame1 = new JFrame();
		panel1 = new JPanel();
		button = new JButton("next");
		layout = new GridBagLayout();
		c = new GridBagConstraints();
		c.fill = GridBagConstraints.BOTH;
		panel1.setLayout(layout);
		button.addActionListener(
			new ActionListener(){
				public void actionPerformed(ActionEvent e) {
					String input = e.getActionCommand();
					if(input.equals("next")){
						new Recipie();
					}		
				}

			}
		);
		Icon bug = new ImageIcon(getClass().getResource("welcome.jpg"));
		label1 = new JLabel(" ",bug,SwingConstants.CENTER);
		c.gridx=0;
		c.gridy=0;
		panel1.add(label1,c);
		c.gridx=0;
		c.gridy=1;
		panel1.add(button,c);
		frame1.add(panel1);
		frame1.setVisible(true);
		//frame1.setSize(600,400);
		frame1.pack();
		frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
public class Test{
	public static void main(String[] args){
		new First();
	}
}