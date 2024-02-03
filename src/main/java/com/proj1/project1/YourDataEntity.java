package com.proj1.project1;

import jakarta.persistence.*;

@Entity
@Table(name = "Employee") // Specify the table name
public class YourDataEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String email;

    // Constructors, getters, and setters

    public YourDataEntity() {
        // Default constructor
    }

    public YourDataEntity(String name, String email) {
        this.name = name;
        this.email = email;
    }

    // Getter and setter methods

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
}
