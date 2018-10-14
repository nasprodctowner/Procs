package bal;

import java.io.Serializable;

public interface JobItf extends Serializable {

    void execute() ;

    int getId() ;
}
