package com.swing.programs;

import java.awt.FlowLayout;

import javax.swing.JComboBox;
import javax.swing.JFrame;

public class ComboBoxExample extends JFrame {

	/* example 1:-
	 * JFrame f;
	 * 
	 * ComboBoxExample() { f = new JFrame("ComboBox Example"); String country[]
	 * = { "India", "Aus", "U.S.A", "England", "Newzealand" }; JComboBox cb =
	 * new JComboBox(country); cb.setBounds(50, 50, 90, 20); f.add(cb);
	 * f.setLayout(null); f.setSize(400, 500); f.setVisible(true); }
	 * 
	 * public static void main(String[] args) { new ComboBoxExample(); }
	 */

	String name[] = { "Abhi", "Adam", "Alex", "Ashkay" }; // list of name.

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public ComboBoxExample() {

		JComboBox jc = new JComboBox(name); // initialzing combo box with list
											// of name.
		add(jc); // adding JComboBox to frame.
		setLayout(new FlowLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400, 400);
		setVisible(true);
	}

	public static void main(String[] args) {
		new ComboBoxExample();
	}

}
