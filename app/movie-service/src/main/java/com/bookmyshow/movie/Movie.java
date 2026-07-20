package com.bookmyshow.movie;


public class Movie {


    private Long id;

    private String title;

    private String language;

    private String genre;



    public Movie(){

    }


    public Movie(Long id,String title,String language,String genre){

        this.id=id;
        this.title=title;
        this.language=language;
        this.genre=genre;

    }



    public Long getId(){
        return id;
    }


    public String getTitle(){
        return title;
    }


    public String getLanguage(){
        return language;
    }


    public String getGenre(){
        return genre;
    }


}
