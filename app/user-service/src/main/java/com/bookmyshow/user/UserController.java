package com.bookmyshow.user;


import org.springframework.web.bind.annotation.*;

import java.util.*;


@RestController

@RequestMapping("/users")

public class UserController {



@GetMapping

public List<Map<String,String>> getUsers(){


List<Map<String,String>> users = new ArrayList<>();


Map<String,String> user1 = new HashMap<>();

user1.put("userId","U001");

user1.put("name","Rahul");

user1.put("email","rahul@test.com");



Map<String,String> user2 = new HashMap<>();

user2.put("userId","U002");

user2.put("name","Amit");

user2.put("email","amit@test.com");



users.add(user1);

users.add(user2);


return users;


}



@PostMapping("/register")

public String registerUser(){


return "User registered successfully";


}




@PostMapping("/login")

public String loginUser(){


return "Login successful";


}


}
