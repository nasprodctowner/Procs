package esclaveClient;

import java.rmi.Naming;

public class Esclave {
    public static void main(String[] args) throws Exception {

        BALItf ref_objBal_distant = (BALItf) Naming.lookup("//"+args[0]+":"+args[1]+"/Bal");

        JobItf job = ref_objBal_distant.getJob();

        job.execute();

    }
}
