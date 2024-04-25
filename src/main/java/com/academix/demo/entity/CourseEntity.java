package com.academix.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "COURSE_TBL")
public class CourseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "COURSE_ID")
    private int courseId;

    @Column(name = "NAME")
    private String name;

    @Column(name = "TRAINER_NAME")
    private String trainerName;

    @Column(name = "DURATION")
    private String duration;

    @Column(name = "START_DATE")
    @Temporal(TemporalType.DATE)
    private java.util.Date startDate;

    @Column(name = "COURSE_TYPE")
    private String courseType;

    @Column(name = "FEES")
    private double fees;

    @Column(name = "CERTIFICATE_AVAILABLE")
    private boolean isCertificateAvailable;

    @Column(name = "DESCRIPTION")
    private String description;
}