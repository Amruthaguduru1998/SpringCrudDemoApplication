package com.demo.springcrud.repository;

import com.demo.springcrud.modal.Subject;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubjectRepository extends CrudRepository<Subject,String> {

}
