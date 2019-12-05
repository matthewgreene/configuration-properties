package com.example.configurationproperties.config;

import com.example.configurationproperties.config.properties.PathConfigProperties;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    @Qualifier("welcomeKit")
    @ConfigurationProperties(prefix = "data.paths.welcome-kit")
    public PathConfigProperties welcomKitProperties() {
        return new PathConfigProperties();
    }

    @Bean
    @Qualifier("box")
    @ConfigurationProperties(prefix = "data.paths.box")
    public PathConfigProperties boxProperties() {
        return new PathConfigProperties();
    }
}
