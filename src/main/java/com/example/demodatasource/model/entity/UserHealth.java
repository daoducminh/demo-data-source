package com.example.demodatasource.model.entity;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "user_health")
@Data
public class UserHealth {
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

    private Float height;

    private Float weight;
}
