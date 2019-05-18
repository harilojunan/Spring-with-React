package com.hari.Class.com.hari.Class.service;

import com.hari.Class.com.hari.Class.entity.Project;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface ProjectService {

    public abstract void saveProject(Project project);
    public abstract List<Project> findAllProject();
    public abstract Project findProjectById(Long id);
    public abstract Project deleteById(Long id);
    public abstract Project updateProjectById(Project project);
}
