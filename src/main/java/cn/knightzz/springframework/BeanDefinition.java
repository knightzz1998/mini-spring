package cn.knightzz.springframework;

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

    private Object bean;

    public BeanDefinition(Object bean) {
        this.bean = bean;
    }

    public Object getBean() {
        return bean;
    }
}
