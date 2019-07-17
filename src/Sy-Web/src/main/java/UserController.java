import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;


public class UserController {
    private UserServiceImpl userService;


    @Before
    public void init(){
        userService = new UserServiceImpl();
    }
    @After
    public void select(){
        userService.select(3);
    }
    @Ignore
    public void insert(){
        userService.insert(new User("3周","815646","小周","1793462109@qq.com"));
    }

    @Ignore
    public void upDate(){
        userService.upDate(new User(1,"3周","815646","小周","1793462109@qq.com"),1);
    }

    @Test
    public void delete(){
        userService.Delete(28);
    }

}
