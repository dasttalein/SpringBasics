package org.example.spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.time.Period;

public class ConfigWithAnnotations1 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext3.xml");

//        Cat myCat = context.getBean("catBean", Cat.class);
//        myCat.say();

        Person person = context.getBean("personBean", Person.class);
        person.callYourPet();

        context.close();
    }
}
