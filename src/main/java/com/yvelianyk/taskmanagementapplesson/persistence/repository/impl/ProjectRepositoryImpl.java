package com.yvelianyk.taskmanagementapplesson.persistence.repository.impl;

import com.yvelianyk.taskmanagementapplesson.persistence.model.Project;
import com.yvelianyk.taskmanagementapplesson.persistence.repository.IProjectRepository;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
@Profile("dev")
public class ProjectRepositoryImpl implements IProjectRepository {

    @Value("${project.prefix}")
    private String prefix;

    @Value("${project.suffix}")
    private Integer suffix;

    List<Project> projects = new ArrayList<>();

    public ProjectRepositoryImpl() {
        super();
    }

    @Override
    public Optional<Project> findById(Long id) {
        return projects.stream().filter(p -> p.getId() == id).findFirst();
    }

    @Override
    public Project save(Project project) {
        Project existingProject = findById(project.getId()).orElse(null);
        updateInternalId(project);

        if(existingProject == null) {
            projects.add(project);
        } else {
            projects.remove(existingProject);
            Project newProject = new Project(project);
            projects.add(newProject);
        }

        return null;
    }

    private void updateInternalId(Project project){
        project.setInternalId(prefix + "-" + project.getId() + "-" + suffix);
    }
}
