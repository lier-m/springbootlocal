package step1.bean.test;

import org.junit.jupiter.api.Test;
import step1.bean.BeanDefinition;
import step1.bean.BeanFactory;
import step1.bean.test.bean.UserService;

/**
 * @author lijing
 * @version 1.0
 * @since 2023-01-05 11:04
 */
public class ApiTest {

    @Test
    public void testBeanFactory(){
        //1、初始化beanFactory
        BeanFactory beanFactory = new BeanFactory();

        //2、注册bean
        BeanDefinition beanDefinition = new BeanDefinition(new UserService());
        beanFactory.registerBeanDefinition("userService",beanDefinition);


        //3、获取bean
        UserService userService = (UserService)beanFactory.getBean("userService");
        userService.queryUserInfo();
    }
}
