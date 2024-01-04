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

    @Test
    public void testLastName(){
        boolean lastName=false;
        try {
            lastName=userRegister.validateLastName("Karn");
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Test
    public void testEMail(){
        boolean mail=false;
        try {
            mail=userRegister.validateEmail("abc@yahoo.com,");
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
