package rmi;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class ServerServer {

	public static void main(String[] args) {

		try {
			Server server = new ServerImpl();
			System.out.println("A");
			Registry refSN = LocateRegistry.createRegistry(1099);
			refSN.rebind("server", server);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
