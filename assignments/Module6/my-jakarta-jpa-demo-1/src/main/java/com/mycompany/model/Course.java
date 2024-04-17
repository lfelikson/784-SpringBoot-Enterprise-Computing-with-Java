package com.mycompany.model;

import jakarta.persistence.*;

@Entity
public class Course {
    @Id
    @SequenceGenerator(
            name = "course_id_seq",
            sequenceName = "course_id_seq",
            allocationSize = 1,
            initialValue = 100
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "course_id_seq"
    )
    private int id;

    @Column(
            nullable = false
    )
    private String name;

    @Column(
            name = "Program_Name"
    )
    private String program;

    public Course (String name, String program) {
        this.name = name;
        this.program = program;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    @Override
    public String toString() {
        return "Course {" + "id=" + id + ", name='" + name + " program='" + program + '\'' + '}';
    }
}