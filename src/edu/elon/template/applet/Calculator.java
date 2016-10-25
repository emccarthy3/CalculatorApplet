package edu.elon.template.applet;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator extends JApplet {
	private boolean needToClear;
	public void init() {
		needToClear = false;
		ScriptEngineManager mgr = new ScriptEngineManager();
		ScriptEngine engine = mgr.getEngineByName("JavaScript");
		
		JFrame frame = new JFrame();
		JPanel textPanel = new JPanel();
		JPanel buttonsPanel = new JPanel();
		textPanel.setLayout(new BorderLayout());
		buttonsPanel.setLayout(new GridLayout(5, 4));

		JTextField resultField = new JTextField();
		textPanel.add(resultField, BorderLayout.NORTH);

		JButton button7 = new JButton("7");
		button7.addActionListener(e ->{
			if(needToClear){
				resultField.setText("");
			}
			needToClear = false;
		resultField.setText(resultField.getText() + 7);
		
		});
		JButton button8 = new JButton("8");
		button8.addActionListener(e ->{
			if(needToClear){
				resultField.setText("");
			}
			needToClear = false;
		resultField.setText(resultField.getText() + 8);
		
		});
		JButton button9 = new JButton("9");
		button9.addActionListener(e ->{
			if(needToClear){
				resultField.setText("");
			}
			needToClear = false;
		resultField.setText(resultField.getText() + 9);
		
		});
		JButton buttonDivide = new JButton("/");
		buttonDivide.addActionListener(e -> resultField.setText(resultField.getText() + "/"));
		JButton button4 = new JButton("4");
		button4.addActionListener(e ->{
			if(needToClear){
				resultField.setText("");
			}
		resultField.setText(resultField.getText() + 4);
		
		});
		JButton button5 = new JButton("5");
		button5.addActionListener(e ->{
			if(needToClear){
				resultField.setText("");
			}
			needToClear = false;
		resultField.setText(resultField.getText() + 5);
		
		});
		JButton button6 = new JButton("6");
		button6.addActionListener(e ->{
			if(needToClear){
				resultField.setText("");
			}
			needToClear = false;
		resultField.setText(resultField.getText() + 6);
		
		});
		JButton buttonMult = new JButton("*");
		buttonMult.addActionListener(e -> resultField.setText(resultField.getText() + "*"));
		JButton button1 = new JButton("1");
		button1.addActionListener(e ->{
			if(needToClear){
				resultField.setText("");
			}
			needToClear = false;
		resultField.setText(resultField.getText() + 1);
		
		});
		JButton button2 = new JButton("2");
		button2.addActionListener(e ->{
			if(needToClear){
				resultField.setText("");
			}
			needToClear = false;
		resultField.setText(resultField.getText() + 2);
		
		});
		JButton button3 = new JButton("3");
		button3.addActionListener(e ->{
			if(needToClear){
				resultField.setText("");
			}
			needToClear = false;
		resultField.setText(resultField.getText() + 3);
		
		});
		JButton buttonSub = new JButton("-");
		buttonSub.addActionListener(e -> resultField.setText(resultField.getText() + "-"));
		JButton button0 = new JButton("0");
		button0.addActionListener(e ->{
			if(needToClear){
				resultField.setText("");
			}
		resultField.setText(resultField.getText() + 0);
		
		});
		JButton buttonDecimal = new JButton(".");
		buttonDecimal.addActionListener(e -> resultField.setText(resultField.getText() + "."));
		JButton buttonEquals = new JButton("=");
		buttonEquals.addActionListener(e -> {
			needToClear = true;
			try {
				resultField.setText(engine.eval(resultField.getText()).toString());
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		});

		JButton buttonPlus = new JButton("+");
		buttonPlus.addActionListener(e -> resultField.setText(resultField.getText() + "+"));
		
	
		resultField.addActionListener(e -> {
			needToClear = true;
			try {
				resultField.setText(engine.eval(resultField.getText()).toString());
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		});

		buttonsPanel.add(button7);
		buttonsPanel.add(button8);
		buttonsPanel.add(button9);
		buttonsPanel.add(buttonDivide);
		buttonsPanel.add(button4);
		buttonsPanel.add(button5);
		buttonsPanel.add(button6);
		buttonsPanel.add(buttonMult);
		buttonsPanel.add(button1);
		buttonsPanel.add(button2);
		buttonsPanel.add(button3);
		buttonsPanel.add(buttonSub);
		buttonsPanel.add(button0);
		buttonsPanel.add(buttonDecimal);
		buttonsPanel.add(buttonEquals);
		buttonsPanel.add(buttonPlus);

		add(textPanel, BorderLayout.NORTH);
		add(buttonsPanel, BorderLayout.SOUTH);

	}


	public void start() {

	}

	public void stop() {

	}

	public void destroy() {

	}


	

}
