package org.example.event.listener;

import org.example.event.event.RegisterSuccessEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class EmailSenderListener {
    /**
     * 注解方式
     */
    @EventListener
    public void onRegisterSuccess(RegisterSuccessEvent event) {
        System.out.println("监听到用户注册成功，发送邮件........");
    }
}
