package com.bookmyshow.movie;


import org.springframework.web.bind.annotation.*;

import java.util.*;


@RestController
@RequestMapping("/movies")
@CrossOrigin
public class MovieController {


    @GetMapping
    public List<Movie> getMovies(){


        return Arrays.asList(

            new Movie(
            1L,
            "Avengers End Game",
            "English",
            "Action"
            ),


            new Movie(
            2L,
            "Jawan",
            "Hindi",
            "Action"
            ),


            new Movie(
            3L,
            "RRR",
            "Telugu",
            "Drama"
            )

        );


    }


}
