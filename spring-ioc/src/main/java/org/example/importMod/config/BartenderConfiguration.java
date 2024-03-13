package org.example.importMod.config;

import org.example.importMod.anno.ConditionalOnBean;
import org.example.importMod.component.Bartender;
import org.example.importMod.component.Boss;
import org.example.importMod.condition.ExistBossCondition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BartenderConfiguration {


    @Bean
    @Conditional(ExistBossCondition.class)
    public Bartender zhangxiaosan() {
        return new Bartender("张小三");
    }


    @Bean
    @ConditionalOnBean(Boss.class)
    public Bartender zhangdasan() {
        return new Bartender("张大三");
    }

}