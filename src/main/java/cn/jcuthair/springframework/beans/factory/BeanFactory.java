package cn.jcuthair.springframework.beans.factory;

import cn.jcuthair.springframework.beans.BeansException;

public interface BeanFactory {

    Object getBean(String name) throws BeansException;

    Object getBean(String name, Object... args) throws BeansException;
}
