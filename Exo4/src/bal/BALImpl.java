package bal;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Vector;

public class BALImpl extends UnicastRemoteObject implements BALItf {

    BALImpl() throws RemoteException {
        super();
    }

    private Vector<JobItf> listeJob = new Vector<>();

    @Override
    public void putJob(JobItf job) {
        System.out.println("J'ai un nouveau job déposé : job "+job.getId());
        listeJob.addElement(job);


    }

    @Override
    public JobItf getJob() {

        if(listeJob.isEmpty()){
            System.out.println("ya r"); return null;
        }

        else
            return listeJob.get(listeJob.size()-1);
    }
}
