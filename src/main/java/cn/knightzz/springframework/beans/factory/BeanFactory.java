package cn.knightzz.springframework.beans.factory;

import cn.knightzz.springframework.beans.factory.config.BeanDefinition;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 王天赐
 * @title: BeanFactory
 * @projectName mini-spring
 * @description: 在 Bean 工厂的实现中，包括了 Bean 的注册，这里注册的是 Bean 的定义信息。同时在这个类中还包括了获取 Bean 的操作。
 * @website <a href="http://knightzz.cn/">http://knightzz.cn/</a>
 * @github <a href="https://github.com/knightzz1998">https://github.com/knightzz1998</a>
 * @create: 2022-11-21 19:41
 */
public interface BeanFactory {
    public Object getBean(String name);
}
