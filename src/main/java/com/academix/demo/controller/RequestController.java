package com.academix.demo.controller;

import com.academix.demo.service.CourseService;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.academix.demo.dto.CourseRequestDTO;
import com.academix.demo.dto.CourseResponseDTO;

@RestController
@RequestMapping("/courses")
public class RequestController {

    private final CourseService courseService;

    
    public RequestController(CourseService courseService) {
        this.courseService = courseService;
    }

    @GetMapping
    public ResponseEntity<?> getAllCourses() {
        // Use courseService to fetch all courses
        return ResponseEntity.ok(courseService.displayAllCourses());
    }

    @PostMapping
    public ResponseEntity<CourseResponseDTO> createCourse(@RequestBody CourseRequestDTO courseRequestDTO) {
        // Use courseService to create a new course
        CourseResponseDTO courseResponseDTO = courseService.onboardNewCourse(courseRequestDTO);
        return ResponseEntity.ok(courseResponseDTO);
    }


    


}