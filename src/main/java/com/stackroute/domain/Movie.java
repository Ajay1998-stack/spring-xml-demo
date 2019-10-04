package com.stackroute.domain;

import org.springframework.beans.factory.annotation.Autowired;

public class Movie {
    Actor actobj;

    public void setActobj(Actor actobj) {
        this.actobj = actobj;
    }


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
}
