package com.stackroute;


import com.stackroute.domain.Movie;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        ((AbstractApplicationContext)context).registerShutdownHook();
//        Movie movie1 =  context.getBean("mov1", Movie.class);
//        System.out.println(movie1.toString());
//        Movie movie2 =  context.getBean("mov2", Movie.class);
//        System.out.println(movie1== movie2);
      }
}