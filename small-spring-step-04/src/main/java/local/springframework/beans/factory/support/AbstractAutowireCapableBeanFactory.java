package local.springframework.beans.factory.support;

import cn.hutool.core.bean.BeanUtil;
import local.PropertyValue;
import local.PropertyValues;
import local.springframework.beans.factory.config.BeanDefinition;
import local.springframework.beans.factory.config.BeanReference;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanCreationException;

import java.lang.reflect.Constructor;

/**
 * @author lijing
 * @version 1.0
 * @since 2023-01-06 16:26
 */
public abstract class AbstractAutowireCapableBeanFactory extends AbstractBeanFactory {

    private InstantiationStrategy instantiationStrategy = new CglibSubclassingInstantiationStrategy();

    @Override
    protected Object createBean(String beanName, BeanDefinition beanDefinition,Object[] args) throws BeansException {
        Object bean = null;
        try {
            //创建bean
            bean = createBeanInstance(beanDefinition,beanName,args);

            //填充属性
            applyPropertyValues(beanName,bean,beanDefinition);
        } catch (Exception e) {
            throw new BeanCreationException("Instantiation of bean failed",e);
        }
        addSingleton(beanName,bean);
        return bean;
    }

    protected  Object createBeanInstance(BeanDefinition beanDefinition,String beanName,Object[] args){
        Constructor constructorToUse = null;
        Class<?> beanClass = beanDefinition.getBeanClass();
        Constructor<?>[] declaredConstructors = beanClass.getDeclaredConstructors();
        for(Constructor ctor : declaredConstructors){
            if(null != args && ctor.getParameterTypes().length == args.length){
                constructorToUse = ctor;
                break;
            }
        }
        return getInstantiationStrategy().instantiate(beanDefinition,beanName,constructorToUse,args);
    }

    public InstantiationStrategy getInstantiationStrategy() {
        return instantiationStrategy;
    }

    public void setInstantiationStrategy(InstantiationStrategy instantiationStrategy) {
        this.instantiationStrategy = instantiationStrategy;
    }

    protected void applyPropertyValues(String beanName,Object bean,BeanDefinition beanDefinition){
        PropertyValues propertyValues = beanDefinition.getPropertyValues();

        for(PropertyValue propertyValue : propertyValues.getPropertyValueList()){
            String name = propertyValue.getName();
            Object value = propertyValue.getValue();

            if(value instanceof BeanReference){
                //A依赖B 获取B的实例化
                BeanReference beanReference = (BeanReference)value;
                value = getBean(beanReference.getBeanName());
            }

            BeanUtil.setFieldValue(bean,name,value);
        }
    }
}
