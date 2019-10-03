package com.stackroute;

import com.stackroute.domain.Actor;
import com.stackroute.domain.Movie;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class Main {
    public static void main(String[] args) {
//        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
//        Movie movie= context.getBean("movobj",Movie.class);
        kjdjbfkjebdkjfbkjldfbkjsbdvkjbklj

        XmlBeanFactory xmlBeanFactory  = new XmlBeanFactory(new ClassPathResource("beans.xml"));
          Movie movie= xmlBeanFactory.getBean("movobj",Movie.class);

        System.out.println(movie.toString());
    }
}