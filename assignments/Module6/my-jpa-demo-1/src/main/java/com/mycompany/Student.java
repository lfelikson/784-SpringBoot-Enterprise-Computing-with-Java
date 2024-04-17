package com.mycompany;

// import javax.persistence.Entity;
// import javax.persistence.GeneratedValue;
// import javax.persistence.Id;

import jakarta.persistence.*;

@Entity
public class Student {
    @Id
    @GeneratedValue
    private long studId;
    private String name;

    public long getStudId () {
        return studId;
    }

    public void setStudId (long studId) {
        this.studId = studId;
    }

    public String getName () {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }

@Override
	public String toString () {
          return "Student =" + "studId " + studId + " name " + name;

	} 

}  