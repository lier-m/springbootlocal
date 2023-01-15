package bean;

/**
 * @author lijing
 * @version 1.0
 * @since 2023-01-05 11:03
 */
public class UserService {

    private String name;

    private Integer age;

    public UserService(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public void queryUserInfo(){
        System.out.println("查询用户信息"+toString());
    }

    @Override
    public String toString() {
        return "UserService{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
