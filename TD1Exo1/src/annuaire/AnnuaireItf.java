package annuaire;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface AnnuaireItf extends Remote {

    void putContact(String nom, String num) throws RemoteException;

    String getContact(String nom) throws RemoteException;
}