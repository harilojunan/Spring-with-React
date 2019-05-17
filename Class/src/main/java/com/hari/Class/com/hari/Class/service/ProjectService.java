package com.hari.Class.com.hari.Class.service;

import com.hari.Class.com.hari.Class.entity.Project;

import java.util.List;

public interface ProjectService {

    void saveProject(Project project);
    List<Project> findAllProjectById();
    Project findProjectById(Long id);
    Project deleteProjectById(Long id);
    Project updateProjectById(Long id);
}
