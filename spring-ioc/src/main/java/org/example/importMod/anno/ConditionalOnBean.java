package org.example.importMod.anno;

import org.example.importMod.condition.OnBeanCondition;
import org.springframework.context.annotation.Conditional;

import java.lang.annotation.*;

/**
 * 可以直接用标注 Boss.class
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.METHOD})
@Conditional(OnBeanCondition.class)
public @interface ConditionalOnBean {

    Class<?>[] value() default {};

    String[] beanNames() default {};
}