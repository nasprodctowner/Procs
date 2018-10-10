package balServer;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Vector;

public class BALImpl extends UnicastRemoteObject implements BALItf {

    BALImpl() throws RemoteException {
        super();
    }

    private Vector<JobItf> listeJob = new Vector<JobItf>();

    @Override
    public void putJob(JobItf job) throws RemoteException {
        listeJob.addElement(job);

    }

    @Override
    public JobItf getJob() throws RemoteException {

        if(listeJob.isEmpty())
            return null;
        else
            return listeJob.get(listeJob.size()-1);
    }
}
