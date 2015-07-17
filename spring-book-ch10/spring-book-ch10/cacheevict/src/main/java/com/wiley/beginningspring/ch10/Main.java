package com.wiley.beginningspring.ch10;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by mertcaliskan
 * on 18/08/14.
 */
public class Main {

    public static void main(String... args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService = context.getBean(UserService.class);

        User userFetch1 = userService.getUser(1);
        System.out.println(userFetch1);
        User userFetch2 = userService.getUser(1);
        System.out.println(userFetch2);

        userService.removeUser(1);
        User userFetch3 = userService.getUser(1);
        System.out.println("Fetched user should be null: " + userFetch3);
    }
}
