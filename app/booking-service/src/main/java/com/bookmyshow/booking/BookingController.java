package com.bookmyshow.booking;


import org.springframework.web.bind.annotation.*;

import java.util.*;


@RestController
@RequestMapping("/bookings")
public class BookingController {


    @GetMapping
    public List<Map<String,String>> getBookings(){


        List<Map<String,String>> bookings = new ArrayList<>();


        Map<String,String> booking1 = new HashMap<>();

        booking1.put("bookingId","B001");

        booking1.put("movie","Avengers Endgame");

        booking1.put("seat","A10");

        booking1.put("status","CONFIRMED");



        Map<String,String> booking2 = new HashMap<>();

        booking2.put("bookingId","B002");

        booking2.put("movie","Jawan");

        booking2.put("seat","B12");

        booking2.put("status","CONFIRMED");



        bookings.add(booking1);

        bookings.add(booking2);


        return bookings;

    }



    @PostMapping
    public String createBooking(){


        return "Booking created successfully";


    }


}
