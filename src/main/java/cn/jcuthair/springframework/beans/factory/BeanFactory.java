package cn.jcuthair.springframework.beans.factory;

import cn.jcuthair.springframework.beans.BeansException;

public interface BeanFactory {
    Object getBean(String name) throws BeansException;
}
