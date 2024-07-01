package com.mycompany;

import jakarta.persistence.*;

@Entity
class Student {

  @Id 
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  private String name;

  // getters and setters

    public long getId () {
        return id;
    }

    public void setId (long id) {
        this.id = id;
    }

    public String getName () {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }

@Override
	public String toString () {
          return "Student =" + "studId " + id + " name " + name;

	}
}
