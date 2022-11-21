package cn.knightzz.springframework;

import cn.knightzz.springframework.test.bean.UserService;
import org.junit.Test;

/**
 * @author 王天赐
 * @title: ApiTest
 * @projectName mini-spring
 * @description:
 * @website <a href="http://knightzz.cn/">http://knightzz.cn/</a>
 * @github <a href="https://github.com/knightzz1998">https://github.com/knightzz1998</a>
 * @create: 2022-11-21 20:06
 */
public class ApiTest {

    @Test
    public void test_BeanFactory(){

        // 1.创建 BeanFactory
        BeanFactory beanFactory = new BeanFactory();

        // 2.注册bean
        BeanDefinition beanDefinition = new BeanDefinition(new UserService());
        beanFactory.registerBeanDefinition("userService", beanDefinition);

        // 3.获取bean
        UserService userService = (UserService) beanFactory.getBean("userService");
        userService.queryUserInfo();

    }
}
