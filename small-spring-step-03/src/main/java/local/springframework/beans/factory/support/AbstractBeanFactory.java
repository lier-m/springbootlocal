package local.springframework.beans.factory.support;


import com.sun.deploy.util.DeploySysRun;
import local.springframework.beans.factory.BeanFactory;
import local.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.BeansException;

/**
 * @author lijing
 * @version 1.0
 * @since 2023-01-06 16:01
 */
public abstract class AbstractBeanFactory extends DefaultSingletonBeanRegistry implements BeanFactory {
    @Override
    public Object getBean(String name,Object[] args) throws BeansException{
        Object bean = getSingleton(name);
        if(bean != null){
            return bean;
        }
        BeanDefinition beanDefinition = getBeanDefinition(name);
        return createBean(name,beanDefinition,args);
    }

    /**
     * 获取bean定义
     * @param beanName
     * @return
     * @throws BeansException
     */
    protected abstract BeanDefinition getBeanDefinition(String beanName) throws BeansException;

    /**
     * 创建bean实例
     * @param beanName
     * @param beanDefinition
     * @return
     */
    protected abstract Object createBean(String beanName,BeanDefinition beanDefinition,Object[] args) throws BeansException;
}
