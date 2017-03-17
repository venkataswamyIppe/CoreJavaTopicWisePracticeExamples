package com.applet.prgramming;

import java.applet.Applet;

import java.awt.*;
public class Applet2 extends Applet {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	TextField t1,t2;
	public void init(){
		t1=new TextField();
		t2=new TextField();
		add(t1);
		add(t2);
	}
	
	public void paint(Graphics g){
		int sq=0;
		sq=Integer.parseInt(t1.getText());
		t2.setText(String.valueOf(sq*sq));
	}

}
