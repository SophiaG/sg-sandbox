package com.spring.example;

/**
 * Created by sophia on 11/08/16.
 */
public class Greeting {

    private final long id;
    private final String content;

    public Greeting(final long id, final String content){
        this.id = id;
        this.content = content;
    }

    public long getId(){
        return id;
    }

    public String getContent(){
        return content;
    }

}
