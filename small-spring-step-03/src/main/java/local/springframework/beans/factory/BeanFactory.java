package local.springframework.beans.factory;

import local.springframework.beans.factory.config.BeanDefinition;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author lijing
 * @version 1.0
 * @since 2023-01-05 10:55
 * bean对象工厂，存放bean定义到Map以及获取
 */
public interface BeanFactory {

    /**
     * bean的获取
     * @param name
     * @return
     */
     Object getBean(String name,Object[] args);


}
