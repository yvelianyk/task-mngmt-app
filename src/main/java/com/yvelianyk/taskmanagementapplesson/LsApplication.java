package com.yvelianyk.taskmanagementapplesson;

import com.yvelianyk.taskmanagementapplesson.persistence.model.Project;
import com.yvelianyk.taskmanagementapplesson.service.IProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import java.time.LocalDate;
import java.util.Optional;

@SpringBootApplication()
public class LsApplication {

	@Autowired
	@Qualifier("projectServiceImpl") IProjectService projectService;

	public static void main(String[] args) {
		SpringApplication.run(LsApplication.class, args);
	}

	@PostConstruct
	public void postConstruct() {
		projectService.save(new Project(1L, "My first Project", LocalDate.now()));
		Optional<Project> optionalProject = projectService.findById(1L);
		optionalProject.ifPresent(System.out::println);
	}

}
