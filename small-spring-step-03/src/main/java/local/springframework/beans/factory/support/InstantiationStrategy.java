package local.springframework.beans.factory.support;

import local.springframework.beans.factory.BeansException;
import local.springframework.beans.factory.config.BeanDefinition;

import java.lang.reflect.Constructor;

/**
 * @author lijing
 * @version 1.0
 * @since 2023-01-14 16:24
 */
public interface InstantiationStrategy {

    Object instantiate(BeanDefinition beanDefinition, String beanName, Constructor ctor,Object[] args) throws BeansException;
}
