package org.example.importMod.condition;

import org.example.importMod.component.Boss;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * @Conditional(ExistBossCondition.class)
 */
public class ExistBossCondition implements Condition {

    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        // 这个地方用 BeanDefinition 做判断而不是 Bean ，
        // 考虑的是当条件匹配时，可能 Boss 还没被创建，导致条件匹配出现偏差
        return context.getBeanFactory().containsBeanDefinition(Boss.class.getName());
    }
}