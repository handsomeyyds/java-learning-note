package org.example.importMod;

import org.example.importMod.component.Bar;
import org.example.importMod.component.Bartender;
import org.example.importMod.component.Boss;
import org.example.importMod.component.Waiter;
import org.example.importMod.config.TavernConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Map;
import java.util.stream.Stream;

public class TavernApplication {

    public static void main(String[] args) {
        // 初始化代码
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.getEnvironment().setActiveProfiles("prod");
        ctx.register(TavernConfiguration.class);
        ctx.refresh();

        Stream.of(ctx.getBeanDefinitionNames()).forEach(System.out::println);
    }

    public static void bar(ApplicationContext ctx) {
        Boss boss = ctx.getBean(Boss.class);
        System.out.println(boss);
        System.out.println("------------------------------");
        Map<String, Bartender> bartenders = ctx.getBeansOfType(Bartender.class);
        bartenders.forEach((name, bartender) -> System.out.println(bartender));
        System.out.println("------------------------------");
        ctx.getBeansOfType(Bar.class).forEach((name, bar) -> {
            System.out.println(name + " " + bar);
        });
        System.out.println("------------------------------");
        System.out.println(ctx.getBean(Waiter.class));
    }
}
