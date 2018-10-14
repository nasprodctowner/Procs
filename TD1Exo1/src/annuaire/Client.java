package annuaire;

import java.rmi.Naming;

public class Client {


    // executer le client en fournissant comme args l'@IP de la machine sur laquelle tourne le registry
    // et le num de port si pas le standard
    //ex : java helloWorld.clientNaming localhost 61000

    public static void main( String[] args ) throws Exception {

       AnnuaireItf ref_obj_distant = (AnnuaireItf) Naming.lookup("//"+args[0]+":"+args[1]+"/Annuaire");
       ref_obj_distant.putContact("Ahmed", "38009072");
       ref_obj_distant.putContact("hani", "3800907");

       System.out.println(ref_obj_distant.getContact("Ahmed"));

    }
}