package com.yvelianyk.taskmanagementapplesson.spring;

import com.yvelianyk.taskmanagementapplesson.persistence.repository.impl.ProjectRepositoryImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// Could be pick up by Spring bootstrapping process
// and put into application context
// @Configuration
public class PersistenceConfig {

    // @Bean
    public ProjectRepositoryImpl projectRepository() {
        return new ProjectRepositoryImpl();
    }

}
