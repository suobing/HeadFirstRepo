package chapter2.ObserverPattern.javaapi;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class SwingObserverExample {
	JFrame frame;
	
	public static void main(String[] args) {
		SwingObserverExample example = new SwingObserverExample();
		example.go();
	}
	
	public void go(){
		frame = new JFrame();
		
		JButton button = new JButton("Should I do it?");
		button.addActionListener(new AngelListener());
		button.addActionListener(new DevilListener());
		
		frame.getContentPane().add(BorderLayout.CENTER, button);
	}
}

class AngelListener implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("Don not do it.");
	}
}

class DevilListener implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("Come on, do it.");
	}
}