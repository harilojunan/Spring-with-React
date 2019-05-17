package com.hari.Class.com.hari.Class.repository;

import com.hari.Class.com.hari.Class.entity.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public interface ProjectRepo extends JpaRepository<Project , Long> {

}
