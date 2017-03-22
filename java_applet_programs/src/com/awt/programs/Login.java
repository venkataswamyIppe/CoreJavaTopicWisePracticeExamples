package com.awt.programs;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends Frame implements ActionListener {

	Label lb1, lb2;
	TextField tx1, tx2;
	Button b;
	String status = "";

	Login() {
		setVisible(true);
		setSize(400, 400);
		setTitle("Login_Page");
		setBackground(Color.cyan);
		lb1 = new Label("Username:");
		lb2 = new Label("Password:");
		tx1 = new TextField(25);
		tx2 = new TextField(25);
		b = new Button("login");
		b.addActionListener(this);
		tx2.setEchoChar('*');
		this.setLayout(new FlowLayout());
		this.add(lb1);
		this.add(tx1);
		this.add(lb2);
		this.add(tx2);
		this.add(b);

	}

	public void actionPerformed(ActionEvent ae) {
		String uname = tx1.getText();
		String upwd = tx2.getText();
		if (uname.equals("user") && upwd.equals("pass")) {
			status = "login success";
		} else {
			status = "login failure";
		}
		repaint();
	}

	public void paint(Graphics g) {
		Font f = new Font("arial", Font.BOLD, 30);
		g.setFont(f);
		this.setForeground(Color.black);
		g.drawString("Status:-->" + status, 50, 300);
	}

	public static void main(String[] args) {
		Login lg = new Login();
	}
}
