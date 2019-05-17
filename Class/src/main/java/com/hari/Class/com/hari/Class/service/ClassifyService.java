package com.hari.Class.com.hari.Class.service;

import com.hari.Class.com.hari.Class.entity.Classify;

import java.util.List;
import java.util.Optional;

public interface ClassifyService {

    void saveClassify(Classify classify);
    List<Classify> getAllClassify();
    Optional<Classify> findClassifyById(Long id);
    Classify deleteClassifyById(Long id);
    void updateClassifyById(Classify classify);
}
