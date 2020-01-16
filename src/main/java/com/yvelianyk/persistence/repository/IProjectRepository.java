package com.yvelianyk.persistence.repository;

import com.yvelianyk.persistence.model.Project;

import java.util.Optional;

public interface IProjectRepository {

    Optional<Project> findById(Long id);

    Project save(Project project);

}
