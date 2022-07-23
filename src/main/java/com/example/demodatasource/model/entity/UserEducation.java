package com.example.demodatasource.model.entity;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "user_education")
@Data
public class UserEducation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    @Setter(AccessLevel.NONE)
    private Long id;

    @Column(name = "id_number")
    private String idNumber;

    private Boolean gender;

    private Boolean married;

    private Date birthday;

    @Column(name = "education_level")
    private String educationLevel;

    @Column(name = "primary_school")
    private String primarySchool;

    @Column(name = "secondary_school")
    private String secondarySchool;

    @Column(name = "high_school")
    private String highSchool;

    private String college;
}
