package annuaire;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Hashtable;

public class AnnuaireImp extends UnicastRemoteObject implements AnnuaireItf {

    public AnnuaireImp() throws RemoteException {
        super();
    }

    private Hashtable<String, String> annuaire = new Hashtable<>();

    @Override
    public void putContact(String nom, String num) throws RemoteException {
        annuaire.put(nom,num);
    }

    @Override
    public String getContact(String nom) throws RemoteException {
        return annuaire.get(nom);
    }
}
