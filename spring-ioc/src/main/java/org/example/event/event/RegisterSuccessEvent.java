package org.example.event.event;

import org.springframework.context.ApplicationEvent;

import java.time.Clock;

/**
 * 注册成功的事件
 */
public class RegisterSuccessEvent extends ApplicationEvent {
    public RegisterSuccessEvent(Object source) {
        super(source);
    }
}
