package com.yvelianyk.service;

import com.yvelianyk.persistence.model.Project;

import java.util.Optional;

public interface IProjectService {
    Optional<Project> findById(Long id);

    Project save(Project project);

}
