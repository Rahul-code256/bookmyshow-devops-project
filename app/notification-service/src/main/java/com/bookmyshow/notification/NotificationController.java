package com.bookmyshow.notification;


import org.springframework.web.bind.annotation.*;

import java.util.*;


@RestController

@RequestMapping("/notifications")

public class NotificationController {



@GetMapping

public List<Map<String,String>> getNotifications(){


List<Map<String,String>> notifications=new ArrayList<>();


Map<String,String> notification1=new HashMap<>();

notification1.put("notificationId","N001");

notification1.put("type","EMAIL");

notification1.put("message","Movie ticket booking confirmed");


Map<String,String> notification2=new HashMap<>();

notification2.put("notificationId","N002");

notification2.put("type","SMS");

notification2.put("message","Payment successful");


notifications.add(notification1);

notifications.add(notification2);


return notifications;


}



@PostMapping("/send")

public String sendNotification(){


return "Notification sent successfully";


}


}
