package cn.jcuthair.springframework.beans.factory.config;

public interface SingletonBeanRegistry {

    Object getSingleton(String beanName);
}
