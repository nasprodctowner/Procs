package balServer;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface BALItf extends Remote {

    void putJob(JobItf job) throws RemoteException;

    JobItf getJob() throws RemoteException;

}
