package edu.elon.accessories;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CalculatorClient extends JFrame {
	private Calculator impl;
	private boolean needToClear;
	private JTextField resultField = new JTextField();
	private JButton button7, button8, button9, buttonDivide, button4, button5, button6, buttonMult, button1, button2, button3, buttonSub, buttonDecimal, buttonEquals, buttonPlus, button0;
	JPanel buttonsPanel;
	JFrame frame;
	JPanel textPanel;

	public CalculatorClient() {
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
	}
		
		public void createListeners() {
			
		button7.addActionListener(e -> {
			if (needToClear) {
				resultField.setText("");
			}
			needToClear = false;
			resultField.setText(resultField.getText() + 7);

		});
		
		button8.addActionListener(e -> {
			if (needToClear) {
				resultField.setText("");
			}
			needToClear = false;
			resultField.setText(resultField.getText() + 8);

		});
		
		button9.addActionListener(e -> {
			if (needToClear) {
				resultField.setText("");
			}
			needToClear = false;
			resultField.setText(resultField.getText() + 9);

		});
		
		buttonDivide.addActionListener(e -> resultField.setText(resultField.getText() + "/"));

		
		button4.addActionListener(e -> {
			if (needToClear) {
				resultField.setText("");
			}
			resultField.setText(resultField.getText() + 4);

		});
		
		button5.addActionListener(e -> {
			if (needToClear) {
				resultField.setText("");
			}
			needToClear = false;
			resultField.setText(resultField.getText() + 5);

		});

		
		button6.addActionListener(e -> {
			if (needToClear) {
				resultField.setText("");
			}
			needToClear = false;
			resultField.setText(resultField.getText() + 6);

		});

		
		buttonMult.addActionListener(e -> resultField.setText(resultField.getText() + "*"));


		button1.addActionListener(e -> {
			if (needToClear) {
				resultField.setText("");
			}
			needToClear = false;
			resultField.setText(resultField.getText() + 1);

		});
		
		button2.addActionListener(e -> {
			if (needToClear) {
				resultField.setText("");
			}
			needToClear = false;
			resultField.setText(resultField.getText() + 2);

		});
		
		button3.addActionListener(e -> {
			if (needToClear) {
				resultField.setText("");
			}
			needToClear = false;
			resultField.setText(resultField.getText() + 3);

		});
		
		buttonSub.addActionListener(e -> resultField.setText(resultField.getText() + "-"));
	
		button0.addActionListener(e -> {
			if (needToClear) {
				resultField.setText("");
			}
			resultField.setText(resultField.getText() + 0);

		});

		
		buttonDecimal.addActionListener(e -> resultField.setText(resultField.getText() + "."));

		
		buttonEquals.addActionListener(e -> {
			needToClear = true;
			try {
				impl = new CalculatorImpl(resultField.getText().toString());
				resultField.setText("" + impl.getResult(resultField.getText().toString()));
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		});

		
		buttonPlus.addActionListener(e -> resultField.setText(resultField.getText() + "+"));

		resultField.addActionListener(e -> {
			needToClear = true;
			try {
				impl = new CalculatorImpl(resultField.getText().toString());
				resultField.setText("" + impl.getResult(resultField.getText().toString()));
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		});
		}
		
		public void addButtons() {

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
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);

		}

	public static void main(String[] args) {
		CalculatorClient client = new CalculatorClient();
		client.createListeners();
		client.addButtons();
	}

}
