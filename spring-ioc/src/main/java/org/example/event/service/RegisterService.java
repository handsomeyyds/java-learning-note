package org.example.event.service;

import org.example.event.event.RegisterSuccessEvent;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Service;


/**
 * 事件源
 *
 * Aware是一个回调接口，会把广播器注册进来
 */
@Service
public class RegisterService implements ApplicationEventPublisherAware {

    /**
     * 广播器
     */
    ApplicationEventPublisher applicationEventPublisher;

    public void register(String username) {
        System.out.println(username + "注册成功..........");
        applicationEventPublisher.publishEvent(new RegisterSuccessEvent(username));
    }

    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.applicationEventPublisher = applicationEventPublisher;
    }
}
