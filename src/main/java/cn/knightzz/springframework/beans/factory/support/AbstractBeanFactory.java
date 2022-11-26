package cn.knightzz.springframework.beans.factory.support;

import cn.knightzz.springframework.beans.factory.BeanFactory;
import cn.knightzz.springframework.beans.factory.config.BeanDefinition;

/**
 * @author 王天赐
 * @title: AbstractBeanFactory
 * @projectName mini-spring
 * @description:
 * @website <a href="http://knightzz.cn/">http://knightzz.cn/</a>
 * @github <a href="https://github.com/knightzz1998">https://github.com/knightzz1998</a>
 * @create: 2022-11-25 16:07
 */
public abstract class AbstractBeanFactory extends DefaultSingletonBeanRegistry implements BeanFactory {

    @Override
    public Object getBean(String name) {

        // 获取单例对象
        Object bean = getSingleton(name);
        // 如果单例对象已经存在, 直接返回
        if(bean != null) {
            return bean;
        }
        return null;
    }

    protected abstract BeanDefinition getBeanDefinition(String beanName)
            ;

}
