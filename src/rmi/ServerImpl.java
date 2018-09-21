package rmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class ServerImpl extends UnicastRemoteObject implements Server {

	private static final long serialVersionUID = 4948687558358973734L;

	protected ServerImpl() throws RemoteException {
		super();

	}

	@Override
	public void call(String a, Client b) throws RemoteException {
		b.echo();

	}

}
