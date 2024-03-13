package org.example.importMod.config;

import org.example.importMod.component.Bar;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BarConfiguration {

    @Bean(name = "DDDD")
    public Bar Tbbbar() {
        return new Bar();
    }

    @Bean(value = "BBBB")
    public Bar bar() {
        return new Bar();
    }
}
