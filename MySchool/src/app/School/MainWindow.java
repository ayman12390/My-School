package app.School;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;

public class MainWindow extends JFrame implements ActionListener {

	// MainWindow = هذا الواجهة الرئيسية
	
	
	JButton button = new JButton("Add student");
	JLabel label = new JLabel();
	JButton button1 = new JButton("Delete student");
	public MainWindow() {
		
		label.setText("Ayman");
		
		
		button.setBounds(0,0,130,50);
		button.setBackground(Color.blue);
		button.addActionListener(this);
		
		button1.setBounds(130,0,130,50);
		
		this.setSize(250,370);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setLayout(null);
		
		this.add(button);
		this.add(button1);
		this.getContentPane().setBackground(new Color(0xff6a1b9a));
		this.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == button) {
			this.dispose();
		   Window_2 window = new Window_2();
		}
	}

	
}
