package com.mycompany.student;

public class Student {
    private Long id;
    private String name;
    private String emailAddr;

    public Student() {
        super();
    }

    public Student(Long id, String name, String emailAddress) {
        super();
        this.id = id;
        this.name = name;
        this.emailAddr = emailAddress;
    }

    public Student(String name, String emailAddress) {
        super();
        this.name = name;
        this.emailAddr = emailAddress;
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

    public String getemailAddr() {
        return emailAddr;
    }

    public void setemailAddr(String emailAddress) {
        this.emailAddr = emailAddress;
    }

    @Override
    public String toString() {
        return String.format("Student [id=%s, name=%s, emailAddr=%s]", id, name, emailAddr);
    }

}