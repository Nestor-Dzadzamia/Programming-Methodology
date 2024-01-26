import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

import acm.program.GraphicsProgram;

public class Problem_72 extends GraphicsProgram{
	private JLabel teach;
	private JTextField teachField;
	private JLabel subj;
	private JTextField subjField;
	private JLabel pupil;
	private JTextField pupilField;
	private JButton addTeach;
	private JButton addSubj;
	private JButton addPupil;
	private JButton displayPupils;
	private JButton displayTeachers;
	private School sc;
	
	
	public void init() {
		setSize(1000, 500); // setting canvas size, so Interactors will display well.
		sc = new School();
		add(sc);
		
		teach = new JLabel("Teach:");
		add(teach, SOUTH);
		
		teachField = new JTextField(5);
		teachField.addActionListener(this);
		add(teachField, SOUTH);
		
		subj = new JLabel("Subj:");
		add(subj, SOUTH);
		
		subjField = new JTextField(5);
		subjField.addActionListener(this);
		add(subjField, SOUTH);
		
		pupil = new JLabel("Pupil:");
		add(pupil, SOUTH);
		
		pupilField = new JTextField(5);
		pupilField.addActionListener(this);
		add(pupilField, SOUTH);
		
		addTeach = new JButton("Add Teach");
		addSubj = new JButton("Add Subj");
		addPupil = new JButton("Add Pupil");
		displayPupils = new JButton("Display Pupils");
		displayTeachers = new JButton("Display Teachers");
		
		add(addTeach, SOUTH);
		add(addSubj, SOUTH);
		add(addPupil, SOUTH);
		add(displayPupils, SOUTH);
		add(displayTeachers, SOUTH);
		
		addActionListeners();
	}
	
	public void run() {
		
	}
	
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == addTeach) {
			sc.addTeacher(teachField.getText());
			teachField.setText("");
		} else if (e.getSource() == addSubj) {
			sc.addSubject(teachField.getText(), subjField.getText());
			teachField.setText("");
			subjField.setText("");
		} else if (e.getSource() == addPupil) {
			sc.addPupil(pupilField.getText(), subjField.getText());
			subjField.setText("");
			pupilField.setText("");
		} else if (e.getSource() == displayTeachers) {
			sc.displayTeachers(pupilField.getText());
		} else if (e.getSource() == displayPupils) {
			sc.displayPupils(teachField.getText());
		}
	}
	
}
