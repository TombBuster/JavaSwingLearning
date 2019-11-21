package com.company;

import java.awt.event.*;
import javax.swing.*;

public class Main {

    public static void main(String[] args) {
	JFrame f = new JFrame("Button Window");
	final JTextField tf = new JTextField();
	tf.setBounds(50, 50, 150, 20);
	JButton b = new JButton("Click Here");
	b.setBounds(50, 100, 100, 30);
	b.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			tf.setText("You clicked the button!");
		}
	});

	f.add(b); f.add(tf);
	f.setSize(400, 500);
	f.setLayout(null);
	f.setVisible(true);
    }
}
