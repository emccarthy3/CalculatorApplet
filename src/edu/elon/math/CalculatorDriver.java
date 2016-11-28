package edu.elon.math;

public class CalculatorDriver {

	public static void main(String[] args) {
		Model model = new Model();
		ControllerInterface controller = new Controller(model);
	}

}
