package maitreClient;

import balServer.JobItf;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface BALItf {

    void putJob(JobItf job) throws RemoteException;

    JobItf getJob() throws RemoteException;

}
