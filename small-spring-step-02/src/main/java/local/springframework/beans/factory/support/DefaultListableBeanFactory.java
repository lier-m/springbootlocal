package local.springframework.beans.factory.support;

import local.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanCreationException;

import java.util.HashMap;
import java.util.Map;

/**
 * @author lijing
 * @version 1.0
 * @since 2023-01-06 16:32
 */
public class DefaultListableBeanFactory extends AbstractAutowireCapableBeanFactory implements BeanDefinitionRegistry {

    private Map<String,BeanDefinition> beanDefinitionMap = new HashMap<>();

    @Override
    public void registryBeanDefinition(String beanName, BeanDefinition beanDefinition) {
        beanDefinitionMap.put(beanName,beanDefinition);
    }

    @Override
    protected BeanDefinition getBeanDefinition(String beanName) throws BeansException {
        BeanDefinition beanDefinition = beanDefinitionMap.get(beanName);
        if(beanDefinition == null) throw new BeanCreationException("no Bean Named" + beanName);
        return beanDefinition;
    }
}
