package cn.knightzz.springframework.beans.factory.config;

/**
 * @author 王天赐
 * @title: SingletonBeanRegistry
 * @projectName mini-spring
 * @description: 定义获取单例对象的接口
 * @website <a href="http://knightzz.cn/">http://knightzz.cn/</a>
 * @github <a href="https://github.com/knightzz1998">https://github.com/knightzz1998</a>
 * @create: 2022-11-25 15:55
 */
public interface SingletonBeanRegistry {

    /**
     * 获取单例的对象
     * @param beanName
     * @return
     */
    Object getSingleton(String beanName);
}
