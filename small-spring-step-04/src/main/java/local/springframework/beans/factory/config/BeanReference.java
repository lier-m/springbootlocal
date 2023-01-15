package local.springframework.beans.factory.config;

/**
 * @author lijing
 * @version 1.0
 * @since 2023-01-15 11:57
 */
public class BeanReference {

    private String beanName;

    public String getBeanName() {
        return beanName;
    }

    public void setBeanName(String beanName) {
        this.beanName = beanName;
    }


    public BeanReference(String beanName) {
        this.beanName = beanName;
    }
}
