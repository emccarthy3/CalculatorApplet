package edu.elon.accessories;

import javax.naming.Context;
import javax.naming.InitialContext;

public class CalculatorServer {

	
	public static void main(String args[]) {
		String inputText = "";
	    CalculatorClient client = new CalculatorClient();
	    
		try {
	      System.out.println("Constructing server implementations...");
	      if (!client.getInputText().equals(null)) {
	    	  inputText = client.getInputText();
	      }
	      
	      Calculator calc = new CalculatorImpl(inputText);

	      System.out.println("Binding server implementations to registry...");
	      Context namingContext = new InitialContext();
	      namingContext.bind("rmi:calculator", calc);
	      System.out.println("Waiting for invocations from clients...");
	    } catch (Exception e) {
	      e.printStackTrace();
	    }
	  }
}
