package annuaire;

import java.rmi.Naming;

public class Server{

    public static void main( String[] args ) throws Exception {

        AnnuaireImp obj = new AnnuaireImp();

        //on exécute le code serveur en donnant l'@ IP et le numéro de p
        //ex : java server localhost 61000
        //args[0] : localhost
        //args[1] : 61000 (num par défaut de rmiregistry)

        Naming.rebind("//"+args[0]+":"+args[1]+"/Annuaire",obj);
        System.out.println("Server ready ...");
    }
}




