package com.richard.springframework.test.bean;

import com.richard.springframework.BeanDefinition;
import com.richard.springframework.BeanFactory;
import org.junit.Test;

/**
 * @Author: Richard
 * @Date: 2022-06-27 9:07
 */
public class ApiTest {

    @Test
    public void test_BeanFactory() {
        // 1.初始化 BeanFactory
        BeanFactory beanFactory = new BeanFactory();

        // 2.注册bean
        BeanDefinition beanDefinition = new BeanDefinition(new UserService());
        beanFactory.registerBeanDefinition("userService", beanDefinition);

        // 3.获取bean
        UserService userService = (UserService) beanFactory.getBean("userService");
        userService.queryUserInfo();
    }


}
