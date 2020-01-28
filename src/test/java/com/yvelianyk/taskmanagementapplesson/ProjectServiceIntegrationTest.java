package com.yvelianyk.taskmanagementapplesson;


import com.yvelianyk.taskmanagementapplesson.persistence.model.Project;
import com.yvelianyk.taskmanagementapplesson.service.IProjectService;
import com.yvelianyk.taskmanagementapplesson.spring.TestConfig;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.PropertySource;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import java.time.LocalDate;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.assertThat;

// TODO: IT IS NOT PASSING
@SpringJUnitConfig(classes = TestConfig.class)
public class ProjectServiceIntegrationTest {

    @Autowired
    private IProjectService projectService;

    @Test
    public void whenSavingProject_thenOK() {
        Project savedProject = projectService.save(new Project(1L, "Test Project", LocalDate.now()));
        assertThat(savedProject, is(notNullValue()));
    }
}
