package com.stackroute.domain;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Movie  implements ApplicationContextAware, BeanFactoryAware, BeanNameAware {
    Actor actobj;
    public Movie(Actor actobj){
        this.actobj  = actobj;
    }

    public Actor getActobj() {
        return actobj;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "actName=" + actobj.name +"  "+"actAge=" + actobj.age+"  "+"actGender="+ actobj.gender+
                '}';
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println(beanFactory);

    }

    @Override
    public void setBeanName(String s) {
        System.out.println(s);

    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
    System.out.println("applicationContext"+" "+ applicationContext);
    }
}
