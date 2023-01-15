package local.springframework.beans.factory.config;

/**
 * @author lijing
 * @version 1.0
 * @since 2023-01-06 16:00
 */
public interface SingletonBeanRegistry {

    /**
     * 获取单例对象
     * @param beanName
     * @return
     */
    Object getSingleton(String beanName);
}
