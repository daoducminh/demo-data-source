package com.example.demodatasource.model.entity;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "user_military_service")
@Data
public class UserMilitaryService {
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

    @Column(name = "has_served")
    private Boolean hasServed;

    @Column(name = "year_start")
    private Integer yearStart;

    @Column(name = "year_end")
    private Integer yearEnd;
}
