package com.avinash.portfoliio.portfolio.model;

public class Project {
    private  String title;
    private String description;
    private String url;

    public  Project(String title, String desc, String url){
        this.title = title;
        this.description = desc;
        this.url = url;
    }

    public String getTitle(){
        return title;
    }
    public String getDescription(){
        return description;
    }

    public String getUrl(){
        return url;
    }
}
