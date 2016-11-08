package edu.elon.accessories;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Calculator extends Remote {

	double getResult(String string) throws RemoteException;

}
