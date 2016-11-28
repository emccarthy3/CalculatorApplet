package edu.elon.math;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.util.Observable;
import java.util.Observer;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class View implements Observer{
private ControllerInterface controller;
private ModelInterface model;
private boolean needToClear;
private JTextField resultField = new JTextField();
private JButton button7, button8, button9, buttonDivide, button4, button5, button6, buttonMult, button1, button2, button3, buttonSub, buttonDecimal, buttonEquals, buttonPlus, button0;
private JPanel buttonsPanel;
private JFrame frame;
private JPanel textPanel;

	public View(ControllerInterface controller, ModelInterface model){
		this.model = model;
		this.controller = controller;
		model.registerObserver(this);
	}
	@Override
	public void update(Observable o, Object arg) {
		//update textfields here when a calculation is made
	}

	public void createView(){
		needToClear = false;

		frame = new JFrame();
		frame.setSize(200, 200);
		textPanel = new JPanel();
		buttonsPanel = new JPanel();
		textPanel.setLayout(new BorderLayout());
		buttonsPanel.setLayout(new GridLayout(5, 4));

		resultField = new JTextField();
		textPanel.add(resultField, BorderLayout.NORTH);

		button7 = new JButton("7");
		button8 = new JButton("8");
		button9 = new JButton("9");
		buttonDivide = new JButton("/");
		button4 = new JButton("4");
		button5 = new JButton("5");
		button6 = new JButton("6");
		buttonMult = new JButton("*");
		button1 = new JButton("1");
		button2 = new JButton("2");
		button3 = new JButton("3");
		buttonSub = new JButton("-");
		buttonDecimal = new JButton(".");
		buttonEquals = new JButton("=");
		buttonPlus = new JButton("+");	
		button0 = new JButton("0");

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

		frame.add(textPanel, BorderLayout.NORTH);
		frame.add(buttonsPanel, BorderLayout.SOUTH);
		
		frame.setVisible(true);
	}
}
