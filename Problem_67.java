import java.awt.event.ActionEvent;

import javax.swing.JTextField;

import acm.graphics.GImage;
import acm.program.GraphicsProgram;

public class Problem_67 extends GraphicsProgram {
	GImage image;
	JTextField field;
	
	public void init() {
		field = new JTextField(10);
		field.setText("");
		field.addActionListener(this);
		add(field, SOUTH);
		addActionListeners();
	}
	
	public void run() {
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == field) {
			try {
				String adress = field.getText();
				field.setText("");
				
				image = new GImage(adress);
				add(image);
			} catch (Exception ex) {
				println("Found Error");
			}
			
		}
	}
	

}
