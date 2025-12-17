package com.example.demo.repository;
import org.springframework.data.jpa.repository.Jparepository;
import com.example.demo.entity.Student;
@repository
public interface studentrepository extends Jparepository<Student,Integer>{
    
}