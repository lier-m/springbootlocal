package local.springframework.beans.factory.support;

import local.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanCreationException;

/**
 * @author lijing
 * @version 1.0
 * @since 2023-01-06 16:26
 */
public abstract class AbstractAutowireCapableBeanFactory extends AbstractBeanFactory {

    @Override
    protected Object createBean(String beanName, BeanDefinition beanDefinition) throws BeansException {
        Object bean = null;
        try {
            bean = beanDefinition.getBeanClass().newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            throw new BeanCreationException("Instantiation of bean failed",e);
        }
        addSingleton(beanName,bean);
        return bean;
    }
}
