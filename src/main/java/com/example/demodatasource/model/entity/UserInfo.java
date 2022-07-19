package com.example.demodatasource.model.entity;

import lombok.AccessLevel;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "user_info")
public class UserInfo {
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

    @Column(name = "phone_number")
    private String phoneNumber;

    private String address;

    private String city;
}
