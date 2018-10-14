package bal;

import java.rmi.Naming;

public class Maitre {

    public static void main(String[] args) throws Exception {

        BALItf ref_objBal_distant = (BALItf) Naming.lookup("//"+args[0]+":"+args[1]+"/Bal");

        JobItf job1 = new Job1();
        JobItf job2 = new Job2();

        ref_objBal_distant.putJob(job1);
        ref_objBal_distant.putJob(job2);

    }
}
