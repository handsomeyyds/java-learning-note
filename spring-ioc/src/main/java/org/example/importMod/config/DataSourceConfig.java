package org.example.importMod.config;

import org.example.importMod.component.DataSource;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class DataSourceConfig {
    @Profile("dev")
    public DataSource dataSourceDev() {
        return new DataSource();
    }

    @Profile("test")
    public DataSource dataSourceTest() {
        return new DataSource();
    }

    @Profile("prod")
    public DataSource dataSourceProd() {
        return new DataSource();
    }
}
