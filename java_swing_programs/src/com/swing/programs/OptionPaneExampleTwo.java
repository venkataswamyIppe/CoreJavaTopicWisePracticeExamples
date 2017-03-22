package com.swing.programs;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class OptionPaneExampleTwo {
	
	JFrame f;  
	public OptionPaneExampleTwo() {
	    f=new JFrame();  
	    JOptionPane.showMessageDialog(f,"Successfully Updated.","Alert",JOptionPane.WARNING_MESSAGE);     
	}  
	public static void main(String[] args) {  
	    new OptionPaneExampleTwo();  
	}  

}
