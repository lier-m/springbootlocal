package local.springframework.beans.factory.config;

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

    public BeanDefinition(Class beanClass) {
        this.beanClass = beanClass;
    }

    public Class getBeanClass() {
        return beanClass;
    }

    public void setBeanClass(Class beanClass) {
        this.beanClass = beanClass;
    }
}
