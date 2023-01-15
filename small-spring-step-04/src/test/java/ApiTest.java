import bean.UserDao;
import bean.UserService;
import local.PropertyValue;
import local.PropertyValues;
import local.springframework.beans.factory.config.BeanDefinition;
import local.springframework.beans.factory.config.BeanReference;
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
        beanFactory.registryBeanDefinition("userDao",new BeanDefinition(UserDao.class));

        PropertyValues propertyValues = new PropertyValues();
        propertyValues.addPropertyValue(new PropertyValue("name","10001"));
        propertyValues.addPropertyValue(new PropertyValue("age",25));
        propertyValues.addPropertyValue(new PropertyValue("userDao",new BeanReference("userDao")));
        beanFactory.registryBeanDefinition("userService",new BeanDefinition(UserService.class,propertyValues));


        //3、第一次获取bean
        UserService userService = (UserService)beanFactory.getBean("userService");
        userService.queryUserInfo();

    }
}
