//package com.hari.Class.com.hari.Class.service;
//
//import com.hari.Class.com.hari.Class.entity.Classify;
//import com.hari.Class.com.hari.Class.repository.ClassifyRepo;
//import org.springframework.beans.factory.annotation.Autowired;
//
//import java.util.List;
//import java.util.Optional;
//
//public class ClassifyServiceImpl implements ClassifyService {
//
//    @Autowired
//    public ClassifyRepo classifyRepo;
//
//
//    @Override
//    public void saveClassify(Classify classify)
//    {
//        classifyRepo.save(classify);
//    }
////
////    @Override
////    public List<Classify> getAllClassify() {
////        return classifyRepo.findAll();
////    }
////
////
////    @Override
////    public Classify findClassifyById(Long id) {
////        return classifyRepo.findClassifyById(id);
////    }
////
////    @Override
////    public Classify deleteClassifyById(Long id) {
////        classifyRepo.deleteById(id);
////        return null;
////    }
////
////
////    @Override
////    public void updateClassifyById(Classify classify) {
////        classifyRepo.save(classify);
////    }
//}
