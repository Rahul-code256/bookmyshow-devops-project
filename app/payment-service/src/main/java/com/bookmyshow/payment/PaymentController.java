package com.bookmyshow.payment;


import org.springframework.web.bind.annotation.*;

import java.util.*;


@RestController

@RequestMapping("/payments")

public class PaymentController {



    @GetMapping

    public List<Map<String,String>> getPayments(){


        List<Map<String,String>> payments = new ArrayList<>();


        Map<String,String> payment1 = new HashMap<>();

        payment1.put("paymentId","PAY001");

        payment1.put("bookingId","B001");

        payment1.put("amount","500");

        payment1.put("status","SUCCESS");



        Map<String,String> payment2 = new HashMap<>();

        payment2.put("paymentId","PAY002");

        payment2.put("bookingId","B002");

        payment2.put("amount","600");

        payment2.put("status","SUCCESS");



        payments.add(payment1);

        payments.add(payment2);



        return payments;

    }




    @PostMapping

    public String makePayment(){


        return "Payment completed successfully";


    }


}
