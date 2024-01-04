import org.example.UserRegister;
import org.junit.Test;

public class UserRegisterTest {

    UserRegister userRegister=new UserRegister();

    @Test
    public void testFirstName(){
        boolean firstName=false;
        try {
            firstName=userRegister.validateFirstName("Akarsh");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
