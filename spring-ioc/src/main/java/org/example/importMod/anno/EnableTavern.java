package org.example.importMod.anno;

import org.example.importMod.component.Waiter;
import org.example.importMod.config.BartenderConfiguration;
import org.example.importMod.config.DataSourceConfig;
import org.example.importMod.selector.BarImportSelector;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Import({BartenderConfiguration.class, BarImportSelector.class, Waiter.class, DataSourceConfig.class})
public @interface EnableTavern {
}
