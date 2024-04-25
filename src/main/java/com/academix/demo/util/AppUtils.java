
package com.academix.demo.util;
import com.academix.demo.entity.CourseEntity;
import com.academix.demo.dto.*;



public class AppUtils {

    public static CourseEntity dtoToEntity(CourseRequestDTO courseDto) {
        CourseEntity courseEntity = new CourseEntity();
        
        courseEntity.setName(courseDto.getName());
        courseEntity.setTrainerName(courseDto.getTrainerName());
        courseEntity.setDuration(courseDto.getDuration());
        courseEntity.setStartDate(courseDto.getStartDate());
        courseEntity.setCourseType(courseDto.getCourseType());
        courseEntity.setFees(courseDto.getFees());
        courseEntity.setCertificateAvailable(courseDto.isCertificateAvailable());
        courseEntity.setDescription(courseDto.getDescription());
        return courseEntity;
    }

    public static CourseResponseDTO entityToDto(CourseEntity courseEntity) {
        CourseResponseDTO courseDto = new CourseResponseDTO();
        
        courseDto.setName(courseEntity.getName());
        courseDto.setTrainerName(courseEntity.getTrainerName());
        courseDto.setDuration(courseEntity.getDuration());
        courseDto.setStartDate(courseEntity.getStartDate());
        courseDto.setCourseType(courseEntity.getCourseType());
        courseDto.setFees(courseEntity.getFees());
        courseDto.setCertificateAvailable(courseEntity.isCertificateAvailable());
        courseDto.setDescription(courseEntity.getDescription());
        return courseDto;
    }

    // Other utility methods...
}