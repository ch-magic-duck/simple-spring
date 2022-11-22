package cn.jcuthair.springframework.test;

import cn.jcuthair.springframework.bean.BeanDefinition;
import cn.jcuthair.springframework.bean.BeanFactory;
import cn.jcuthair.springframework.test.bean.UserService;
import org.junit.Test;

public class ApiTest {

    @Test
    public void test_BeanFactory() {
        // 1.初始化 BeanFactory
        BeanFactory beanFactory = new BeanFactory();
        // 2.注册 bean
        BeanDefinition beanDefinition = new BeanDefinition(new UserService());
        beanFactory.registerBeanDefinition(UserService.class.getName(), beanDefinition);
        // 3.获取 bean
        UserService userService = (UserService) beanFactory.getBean(UserService.class.getName());
        userService.queryUserInfo();
    }
}
