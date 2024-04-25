package com.academix.demo.service;
import java.util.ArrayList; // Import the ArrayList class

import com.academix.demo.dto.CourseRequestDTO;
import com.academix.demo.dto.CourseResponseDTO;
import com.academix.demo.entity.CourseEntity;
import com.academix.demo.util.AppUtils;

import java.util.List; // Import the List class

import org.springframework.stereotype.Service;
import com.academix.demo.dao.CourseDao;
import com.academix.demo.entity.*;
import java.util.stream.StreamSupport; // Import the StreamSupport class
import java.util.stream.Collectors; // Import the Collectors class



@Service
public class CourseService {
    
    private final CourseDao courseDao;

   
    public CourseService(CourseDao courseDao) {
        this.courseDao = courseDao;
    }

    
    public CourseResponseDTO onboardNewCourse(CourseRequestDTO courseRequestDTO){
       
        CourseEntity courseEntity = AppUtils.dtoToEntity(courseRequestDTO);
        courseDao.save(courseEntity);
        //convert Entity to DTO
        CourseResponseDTO courseResponseDTO = AppUtils.entityToDto(courseEntity);
        return courseResponseDTO;
    }

    public List<CourseResponseDTO> displayAllCourses() {
        List<CourseEntity> courseEntities = StreamSupport.stream(courseDao.findAll().spliterator(), false)
            .collect(Collectors.toList());
        List<CourseResponseDTO> courseResponseDTOs = new ArrayList<>();
    
        for (CourseEntity courseEntity : courseEntities) {
            CourseResponseDTO courseResponseDTO = new CourseResponseDTO();
            // Assuming CourseResponseDTO has the same fields as CourseEntity
            
            courseResponseDTO.setName(courseEntity.getName());
            courseResponseDTO.setTrainerName(courseEntity.getTrainerName());
            courseResponseDTO.setDuration(courseEntity.getDuration());
            courseResponseDTO.setStartDate(courseEntity.getStartDate());
            courseResponseDTO.setCourseType(courseEntity.getCourseType());
            courseResponseDTO.setFees(courseEntity.getFees());
            courseResponseDTO.setCertificateAvailable(courseEntity.isCertificateAvailable());
            courseResponseDTO.setDescription(courseEntity.getDescription());
            courseResponseDTOs.add(courseResponseDTO);
        }
    
        return courseResponseDTOs;
    }



   



}
