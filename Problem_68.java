import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JTextField;

import acm.graphics.GLabel;
import acm.program.GraphicsProgram;

public class Problem_68 extends GraphicsProgram	{
	private JTextField field;
	private JButton button;
	private int yCoordinate = 15;
	
	public void init() {
		field = new JTextField(20);
		field.addActionListener(this);
		add(field, SOUTH);
		
		button = new JButton("Send");
		add(button, SOUTH);
		addActionListeners();
	}
	
	public void run() {
		
	}
	
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == button || e.getSource() == field) {
			GLabel message = new GLabel(field.getText());
			add(message, 0, yCoordinate);
			yCoordinate += 25;
			field.setText("");
		}
	}
}
