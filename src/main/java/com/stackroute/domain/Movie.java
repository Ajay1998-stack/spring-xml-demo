package com.stackroute.domain;

public class Movie {
    Actor actobj;

    public void setActobj(Actor actobj) {
        this.actobj = actobj;
    }

    public Actor getActobj() {
        return actobj;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "actorName=" + actobj.getName() +"\n"+"actorAge=" + actobj.getAge() +"\n"+ "actorGender=" + actobj.getGender() +
                '}';
    }
}
