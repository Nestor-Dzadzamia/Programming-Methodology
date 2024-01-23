import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JTextField;

import acm.graphics.GCompound;
import acm.graphics.GLabel;
import acm.program.GraphicsProgram;

public class Problem_69 extends GraphicsProgram	{
	private JTextField field;
	private JButton button;
	private int yCoordinate = 15;
	private GCompound comp;
	
	public void init() {
		comp = new GCompound();
		field = new JTextField(20);
		field.addActionListener(this);
		add(field, SOUTH);
		
		button = new JButton("Send");
		add(button, SOUTH);
		add(comp);
		addActionListeners();
	}
	
	public void run() {
		
	}
	
	public void actionPerformed(ActionEvent e) {
		if ((e.getSource() == button || e.getSource() == field) && !field.getText().equals("")) {
			GLabel message = new GLabel(field.getText());
			comp.add(message, 0, yCoordinate);
			checkForScroll();
			yCoordinate += 25;
			field.setText("");
		}
	}
	
	private void checkForScroll() {
		if (comp.getHeight() > getHeight()) {
			comp.setLocation(0, getHeight() - comp.getHeight());
		}
	}
}
