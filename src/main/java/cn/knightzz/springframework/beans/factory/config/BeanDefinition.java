package cn.knightzz.springframework.beans.factory.config;

/**
 * @author 王天赐
 * @title: BeanDefinition
 * @projectName mini-spring
 * @description: 用于定义 Bean 实例化信息，现在的实现是以一个 Object 存放对象
 * @website <a href="http://knightzz.cn/">http://knightzz.cn/</a>
 * @github <a href="https://github.com/knightzz1998">https://github.com/knightzz1998</a>
 * @create: 2022-11-21 19:41
 */
public class BeanDefinition {

    /**
     * 定义Bean的Class对象, 目的是为了把对象实例化的操作放到容器里面执行
     */
    private Class beanClass;

    public BeanDefinition(Class beanClass) {
        this.beanClass = beanClass;
    }

    public Class getBeanClass() {
        return beanClass;
    }

    public void setBeanClass(Class beanClass) {
        this.beanClass = beanClass;
    }
}
