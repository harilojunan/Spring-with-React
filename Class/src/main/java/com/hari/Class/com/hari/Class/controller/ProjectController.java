package com.hari.Class.com.hari.Class.controller;

import com.hari.Class.com.hari.Class.entity.Project;
import com.hari.Class.com.hari.Class.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class ProjectController {

    @Autowired
    ProjectService projectService;

    @PostMapping("/saveProject")
    public HttpStatus createProject(Project project){
        projectService.saveProject(project);
        return HttpStatus.CREATED;
    }

    @GetMapping("/getAllProject")
    public List<Project> getAllProject(){
        return projectService.findAllProject();
    }

    @GetMapping("/getProjectById/{id}")
    public ResponseEntity<Project> getProjectById(@PathVariable ("id") Long id){
        projectService.findProjectById(id);
        return new ResponseEntity<Project> (HttpStatus.OK);
    }

    @DeleteMapping("/deleteProject/{id}")
    public ResponseEntity<Project> deleteProject(@PathVariable ("id") Long id){
        projectService.deleteById(id);
        return new ResponseEntity<Project>(HttpStatus.NO_CONTENT);
    }

    @PutMapping("updateProject")
    public ResponseEntity<Project> updateProject(@Valid @RequestBody Project project){
        projectService.updateProjectById(project);
        return new ResponseEntity<Project>(HttpStatus.OK);
    }
}
