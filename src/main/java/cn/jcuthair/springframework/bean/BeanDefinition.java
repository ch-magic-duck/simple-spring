package cn.jcuthair.springframework.bean;

/**
 * 用于定义 Bean 实例化信息，现在的实现是以一个 Object 存放对象
 *
 * 后面陆续的实现中会逐步完善 BeanDefinition 相关属性的填充，例如：
 * SCOPE_SINGLETON、SCOPE_PROTOTYPE、ROLE_APPLICATION、ROLE_SUPPORT、ROLE_INFRASTRUCTURE 以及 Bean Class 信息。
 */
public class BeanDefinition {

    private Object bean;

    public BeanDefinition(Object bean) {
        this.bean = bean;
    }

    public Object getBean() {
        return bean;
    }
}
