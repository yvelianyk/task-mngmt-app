package com.yvelianyk.taskmanagementapplesson.service;

import com.yvelianyk.taskmanagementapplesson.persistence.model.Project;

import java.util.Optional;

public interface IProjectService {
    Optional<Project> findById(Long id);

    Project save(Project project);

}
