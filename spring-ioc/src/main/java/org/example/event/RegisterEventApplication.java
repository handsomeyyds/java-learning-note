package org.example.event;

import org.example.event.service.RegisterService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class RegisterEventApplication {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext("org.example.event");
        RegisterService registerService = ctx.getBean(RegisterService.class);
        registerService.register("Abcj");
    }
}
