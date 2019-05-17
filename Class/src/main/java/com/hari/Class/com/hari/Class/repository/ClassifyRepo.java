package com.hari.Class.com.hari.Class.repository;

import com.hari.Class.com.hari.Class.entity.Classify;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ClassifyRepo extends JpaRepository<Classify , Long> {

}
