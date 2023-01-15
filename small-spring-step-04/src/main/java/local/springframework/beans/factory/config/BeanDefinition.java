package local.springframework.beans.factory.config;

import local.PropertyValue;
import local.PropertyValues;

/**
 * @author lijing
 * @version 1.0
 * @since 2023-01-05 10:52
 * 用于定义bean的类信息
 */
public class BeanDefinition {

    /**
     * 类信息
     */
    private Class beanClass;

    /**
     * 类属性
     */
    private PropertyValues propertyValues;

    public BeanDefinition(Class beanClass) {
        this.beanClass = beanClass;
        this.propertyValues = new PropertyValues();
    }

    public Class getBeanClass() {
        return beanClass;
    }

    public void setBeanClass(Class beanClass) {
        this.beanClass = beanClass;
    }

    public PropertyValues getPropertyValues() {
        return propertyValues;
    }

    public void setPropertyValues(PropertyValues propertyValues) {
        this.propertyValues = propertyValues;
    }

    public BeanDefinition(Class beanClass, PropertyValues propertyValues) {
        this.beanClass = beanClass;
        this.propertyValues = propertyValues;
    }
}

