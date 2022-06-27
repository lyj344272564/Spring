package com.richard.springframework;

import javafx.beans.binding.ObjectExpression;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @Author: Richard
 * @Date: 2022-06-27 8:53
 * 代表了 Bean 对象的工厂，可以存放 Bean 定义到 Map 中以及获取
 */
public class BeanFactory {

    private Map<String, BeanDefinition> beanDefinitionMap = new ConcurrentHashMap<>();

    public Object getBean(String name) {
        return beanDefinitionMap.get(name).getBean();
    }

    public void registerBeanDefinition(String name, BeanDefinition beanDefinition) {
        beanDefinitionMap.put(name, beanDefinition);
    }

}
