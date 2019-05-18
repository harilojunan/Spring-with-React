package com.hari.Class.com.hari.Class.service;

import com.hari.Class.com.hari.Class.entity.Project;
import com.hari.Class.com.hari.Class.repository.ProjectRepo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class ProjectServiceImpl implements ProjectService {

    @Autowired
    ProjectRepo projectRepo;

    @Override
    public void saveProject(Project project) {
        projectRepo.save(project);
    }

    @Override
    public List<Project> findAllProject() {
        return findAllProject();
    }

    public Project deleteById(Long id){
        projectRepo.deleteById(id);
        return null;
    }


    @Override
    public Project findProjectById(Long id) {
        return projectRepo.findProjectById(id);
    }

    @Override
    public Project updateProjectById(Project project) {
       return projectRepo.save(project);
    }
}
