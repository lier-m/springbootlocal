package step1.bean;

/**
 * @author lijing
 * @version 1.0
 * @since 2023-01-05 10:52
 * 用于定义bean的实例化信息
 */
public class BeanDefinition {

    /**
     * 实例化信息
     */
    private Object bean;

    public BeanDefinition(Object bean) {
        this.bean = bean;
    }

    public Object getBean() {
        return bean;
    }

    public void setBean(Object bean) {
        this.bean = bean;
    }
}
