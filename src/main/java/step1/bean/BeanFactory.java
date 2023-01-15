package step1.bean;

import org.springframework.util.StringUtils;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author lijing
 * @version 1.0
 * @since 2023-01-05 10:55
 * bean对象工厂，存放bean定义到Map以及获取
 */
public class BeanFactory {
    /**
     * bean定义Map
     */
    private Map<String,BeanDefinition> beanDefinitionMap = new ConcurrentHashMap<>();

    /**
     * bean的获取
     * @param name
     * @return
     */
    public Object getBean(String name){
        return beanDefinitionMap.get(name).getBean();
    }

    /**
     * bean的注册，注册的是bean的定义
     * @param name
     * @param beanDefinition
     */
    public void registerBeanDefinition(String name,BeanDefinition beanDefinition){
        beanDefinitionMap.put(name,beanDefinition);
    }
}
