package com.swing.programs;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class OptionPaneExampleThree {
	
	JFrame f;  
	OptionPaneExampleThree(){  
	    f=new JFrame();   
	    String name=JOptionPane.showInputDialog(f,"Enter Your Name"); 
	    JLabel label=new JLabel();
	    label.setText("Name : "+name);
	    f.add(label);
	    f.setLayout(new FlowLayout());
	    f.setSize(200, 200); // setting size
	    f.setVisible(true);
	}  
	public static void main(String[] args) {  
	    new OptionPaneExampleThree();  
	}  

}
