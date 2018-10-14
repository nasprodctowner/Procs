package bal;

public class Job1 implements JobItf {

    @Override
    public void execute() { System.out.println("Je suis le job 1");
    }

    @Override
    public int getId() {
        return 1;
    }


}
