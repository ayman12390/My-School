package app.School;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Window_2 extends JFrame implements ActionListener{

	JButton button1 = new JButton();
	JButton button2 = new JButton();
	JButton button3 = new JButton();
	JButton button4 = new JButton();
	JButton button5 = new JButton();
	
	JLabel label = new JLabel();
	JLabel label1 = new JLabel("Where you want add student");
	
	public Window_2() {

		label.setText("Grade 1");
		label.setBackground(new Color(0,0,80));
		
		button1.add(label);
		button1.setBounds(10,50,230,30);
		
		this.setSize(250,370);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setLayout(null);
		
		this.add(label1);
		this.add(button1);
		this.setTitle("Ayman");
		
		this.getContentPane().setBackground(new Color(0xff6a1b9a));
		this.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
