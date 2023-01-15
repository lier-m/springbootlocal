import bean.UserService;
import local.springframework.beans.factory.config.BeanDefinition;
import local.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.junit.jupiter.api.Test;

/**
 * @author lijing
 * @version 1.0
 * @since 2023-01-05 11:04
 */
public class ApiTest {

    @Test
    public void testBeanFactory(){
        //1、初始化beanFactory
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();

        //2、注册bean
        BeanDefinition beanDefinition = new BeanDefinition(UserService.class);
        beanFactory.registryBeanDefinition("userService",beanDefinition);

        //3、第一次获取bean
        UserService userService = (UserService)beanFactory.getBean("userService");
        userService.queryUserInfo();

        //4、第二次获取bean
        UserService userService_singleton = (UserService)beanFactory.getBean("userService");
        userService_singleton.queryUserInfo();
    }
}
