

public class UserServiceImpl implements UserService{
    private UserDao userDao = new UserDao();

    public void select(int id) {
        userDao.select(id);
    }
    public void insert(User user){
        userDao.insert(user);
    }
    public void upDate(User user,int i){
        userDao.upDate(user,i);
    }

    public void Delete(int i){
        userDao.Delete(i);
    }


}
