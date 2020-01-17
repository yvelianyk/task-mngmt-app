package com.yvelianyk.taskmanagementapplesson.persistence.repository;

import com.yvelianyk.taskmanagementapplesson.persistence.model.Project;

import java.util.Optional;

public interface IProjectRepository {

    Optional<Project> findById(Long id);

    Project save(Project project);

}
