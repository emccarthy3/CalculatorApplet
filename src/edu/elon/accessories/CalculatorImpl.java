package edu.elon.accessories;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class CalculatorImpl extends UnicastRemoteObject implements Calculator {
	private String evaluation;
	
	public CalculatorImpl(String eval) throws RemoteException {
		eval = evaluation;
	}


	ScriptEngineManager mgr = new ScriptEngineManager();
	ScriptEngine engine = mgr.getEngineByName("JavaScript");

	public double getResult(String eval){
		double result = 0;
		try {
			result = Double.parseDouble(engine.eval(eval).toString());
		} catch (ScriptException e) {
			e.printStackTrace();
		}
		return result;
		
	}

}
