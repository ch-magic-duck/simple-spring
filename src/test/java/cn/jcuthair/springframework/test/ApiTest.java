package cn.jcuthair.springframework.test;

import cn.jcuthair.springframework.beans.factory.config.BeanDefinition;
import cn.jcuthair.springframework.beans.factory.support.DefaultListableBeanFactory;
import cn.jcuthair.springframework.test.beans.UserService;
import org.junit.Test;

public class ApiTest {

    /**
     * 初步实现 Bean 的定义、注册、获取
     */
    @Test
    public void test_BeanFactory() {
        // 1.初始化 BeanFactory
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        // 2.注册 bean
        BeanDefinition beanDefinition = new BeanDefinition(UserService.class);
        beanFactory.registerBeanDefinition(UserService.class.getName(), beanDefinition);
        // 3.第一次获取 bean
        UserService userService = (UserService) beanFactory.getBean(UserService.class.getName());
        userService.queryUserInfo();
        // 4.第二次获取 bean from Singleton
        UserService userService_singleton = (UserService) beanFactory.getSingleton(UserService.class.getName());
        userService_singleton.queryUserInfo();
    }


    /**
     * 实现实例化一个含有构造函数的对象
     */
    @Test
    public void test_BeanFactory_2() {
        // 1.初始化 BeanFactory
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        // 2.注册 bean
        BeanDefinition beanDefinition = new BeanDefinition(UserService.class);
        beanFactory.registerBeanDefinition(UserService.class.getName(), beanDefinition);
        // 3.获取 bean
        UserService userService = (UserService) beanFactory.getBean(UserService.class.getName(), "小A");
        userService.queryUserInfo();
    }
}
