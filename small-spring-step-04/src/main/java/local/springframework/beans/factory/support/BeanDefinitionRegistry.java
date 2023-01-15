package local.springframework.beans.factory.support;

import local.springframework.beans.factory.config.BeanDefinition;

/**
 * @author lijing
 * @version 1.0
 * @since 2023-01-06 16:35
 */
public interface BeanDefinitionRegistry {
    void registryBeanDefinition(String beanName, BeanDefinition beanDefinition);
}
