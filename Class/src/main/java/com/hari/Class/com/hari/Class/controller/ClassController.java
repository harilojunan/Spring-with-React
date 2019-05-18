//package com.hari.Class.com.hari.Class.controller;
//
//import com.hari.Class.com.hari.Class.entity.Classify;
//import com.hari.Class.com.hari.Class.service.ClassifyService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//import javax.validation.Valid;
//import java.awt.print.Book;
//import java.util.List;
//
//@RestController
//public class ClassController {
//
//    @Autowired
//    ClassifyService classifyService;
//
//
//    //save Classification
//    @PostMapping("/saveClass")
//    public HttpStatus createClassify(@Valid @RequestBody Classify classify){
//        classifyService.saveClassify(classify);
//        return HttpStatus.CREATED;
//    }
////
////    //get All Classification
////    @GetMapping("/getAllClass")
////    public List<Classify> getAllClass(){
////        return classifyService.getAllClassify();
////    }
////
////    //get Classification by id
////    @GetMapping("getClassById/{id}")
////    public ResponseEntity<Classify> getClassById(@PathVariable ("id") Long id){
////        classifyService.findClassifyById(id);
////        return new ResponseEntity<Classify>(HttpStatus.OK);
////    }
////
////    //delete Classification
////    @DeleteMapping("deleteClass/{id}")
////    public ResponseEntity<Classify> deleteClass(@PathVariable ("id") Long id){
////        classifyService.deleteClassifyById(id);
////        return new ResponseEntity<Classify>(HttpStatus.NO_CONTENT);
////    }
////
////    //update Classification
////    @PutMapping("/updateClassification")
////    public ResponseEntity<Classify> updateClass(@Valid @RequestBody Classify classify){
////        classifyService.updateClassifyById(classify);
////        return new ResponseEntity<Classify>(classify, HttpStatus.OK);
////    }
//
//}
