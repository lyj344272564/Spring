package com.richard.springframework;

/**
 * @Author: Richard
 * @Date: 2022-06-27 8:53
 * 用于定义 Bean 实例化信息，现在的实现是以一个 Object 存放对象
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
