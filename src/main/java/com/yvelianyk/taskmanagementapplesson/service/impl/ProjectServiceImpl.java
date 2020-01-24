package com.yvelianyk.taskmanagementapplesson.service.impl;

import com.yvelianyk.taskmanagementapplesson.persistence.model.Project;
import com.yvelianyk.taskmanagementapplesson.persistence.repository.IProjectRepository;
import com.yvelianyk.taskmanagementapplesson.service.IProjectService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProjectServiceImpl implements IProjectService {

    private IProjectRepository projectRepository;

    public ProjectServiceImpl(IProjectRepository projectRepository) {
        this.projectRepository = projectRepository;
    }

    @Override
    public Optional<Project> findById(Long id) {
        return projectRepository.findById(id);
    }

    @Override
    public Project save(Project project) {
        return projectRepository.save(project);
    }
}
