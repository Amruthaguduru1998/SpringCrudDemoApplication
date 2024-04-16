package com.demo.springcrud.service;

import com.demo.springcrud.modal.Subject;
import com.demo.springcrud.repository.SubjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SubjectService {

    @Autowired
    SubjectRepository subjectRepository;

    public List<Subject> getAllSubject(){

        List<Subject> subjects=new ArrayList<>();
        subjectRepository.findAll().forEach(subjects::add);
        return subjects;
    }

    public void addSubject(Subject subject) {
        subjectRepository.save(subject);
    }

    public void  updateSubject(String id, Subject subject) {
        subjectRepository.save(subject);
    }

    public void deleteSubject(String id) {
        subjectRepository.deleteById(id);
    }
}
