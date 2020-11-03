package top.hiccup.spring;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

/**
 * 测试
 *
 * @author wenhy
 * @date 2018/7/29
 */
public class MainTest {

    public static void main(String[] args) {
        // XmlBeanFactory仅仅是对DefaultListableBeanFactory简单的封装
        XmlBeanFactory xmlBeanFactory = new XmlBeanFactory(new ClassPathResource("top.hiccup.spring/root.xml"));
        System.out.println(xmlBeanFactory.getBean("user"));

//        // 去掉XmlBeanFactory外衣，DefaultListableBeanFactory创建后只是一个空壳子（空的容器）
//        DefaultListableBeanFactory defaultListableBeanFactory = new DefaultListableBeanFactory();
//        XmlBeanDefinitionReader xmlBeanDefinitionReader = new XmlBeanDefinitionReader(defaultListableBeanFactory);
//        // loadBeanDefinitions才是往里面装载东西
//        xmlBeanDefinitionReader.loadBeanDefinitions(new ClassPathResource("top.hiccup.spring/root.xml"));
//        System.out.println(xmlBeanFactory.getBean("user"));
//
//        xmlBeanDefinitionReader.loadBeanDefinitions(new ClassPathResource("top.hiccup.spring/root2.xml"));
//        System.out.println(xmlBeanFactory.getBean("user2"));

    }
}
