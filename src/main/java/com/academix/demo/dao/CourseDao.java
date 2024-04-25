package com.academix.demo.dao;
import org.springframework.data.repository.CrudRepository; // Import the CrudRepository class
import com.academix.demo.entity.*;


public interface CourseDao extends CrudRepository<CourseEntity, Integer> {
    
    
}
