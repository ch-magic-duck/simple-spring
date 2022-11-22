package cn.jcuthair.springframework.test;

import cn.jcuthair.springframework.beans.factory.config.BeanDefinition;
import cn.jcuthair.springframework.beans.factory.BeanFactory;
import cn.jcuthair.springframework.beans.factory.support.DefaultListableBeanFactory;
import cn.jcuthair.springframework.test.beans.UserService;
import org.junit.Test;

public class ApiTest {

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
}
