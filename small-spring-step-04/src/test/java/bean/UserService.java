package bean;

/**
 * @author lijing
 * @version 1.0
 * @since 2023-01-05 11:03
 */
public class UserService {

    private String name;

    private Integer age;

    private UserDao userDao;

    public UserService() {
    }

    public UserService(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public void queryUserInfo(){
        System.out.println("查询用户信息:"+userDao.queryUserName(name));
    }

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public String toString() {
        return "UserService{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", userDao=" + userDao +
                '}';
    }
}
