package bal;

public class Job2 implements JobItf {

    @Override
    public void execute() {
        System.out.println("Je suis le job 2");
    }

    @Override
    public int getId() {
        return 2;
    }
}
