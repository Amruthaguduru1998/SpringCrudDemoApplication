package com.demo.springcrud.controller;

import com.demo.springcrud.modal.Subject;
import com.demo.springcrud.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SubjectController {

    @Autowired
    SubjectService subjectService;

    @RequestMapping("/subjects/getAll")
    public List<Subject> getAllSubjets(){
        return  subjectService.getAllSubject();
    }

    @PostMapping("/subjects/addSubject")
    public String addSubject(@RequestBody Subject subject){
        subjectService.addSubject(subject);
        return "created record successfully";
    }

    @PutMapping("/subjects/{Id}")
    public  String  updateSubject(@PathVariable("Id") String Id,@RequestBody Subject subject){
       subjectService.updateSubject(Id,subject);
        return " update record successfully";
    }

    @DeleteMapping("/subjects/delete/{Id}")
    public String deletSubject(@PathVariable String Id){
        subjectService.deleteSubject(Id);
        return "delete record  sucessfull";
    }
}
