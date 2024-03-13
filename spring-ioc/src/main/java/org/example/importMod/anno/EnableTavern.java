package org.example.importMod.anno;

import org.example.importMod.component.Boss;
import org.example.importMod.component.Waiter;
import org.example.importMod.config.BartenderConfiguration;
import org.example.importMod.selector.BarImportSelector;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Import({Boss.class, BartenderConfiguration.class, BarImportSelector.class, Waiter.class})
public @interface EnableTavern {
}
