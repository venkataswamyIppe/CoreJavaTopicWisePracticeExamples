package com.swing.programs;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class OptionPaneExampleOne {
	
	JFrame f;  
	OptionPaneExampleOne(){  
	    f=new JFrame();  
	    JOptionPane.showMessageDialog(f,"Hello, Welcome to JavaSwing.");  
	}  
	public static void main(String[] args) {  
	    new OptionPaneExampleOne();  
	}  

}
