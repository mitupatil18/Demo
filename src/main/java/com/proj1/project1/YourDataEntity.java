package com.proj1.project1;

import jakarta.persistence.*;
import jdk.jfr.Name;

@Entity
@Table(name = "Student")
public class YourDataEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private String name;

    private String email;


    private String college;
    public YourDataEntity() {

    }

    public YourDataEntity(String name, String email, String college) {
        this.name = name;
        this.email = email;
        this.college = college;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }
}
