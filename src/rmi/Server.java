package rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Server extends Remote {
	
	public void call(String a, Client b) throws RemoteException;
	
	

}
