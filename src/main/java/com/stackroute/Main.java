package com.stackroute;


import com.stackroute.domain.Movie;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Movie movie1 =  context.getBean("mov1", Movie.class);
        System.out.println(movie1.toString());
        Movie movie3 =  context.getBean("mov3", Movie.class);
        System.out.println(movie3.toString());
//        Movie movie2 =  context.getBean("mov2", Movie.class);
//        System.out.println(movie1== movie2);
      }
}