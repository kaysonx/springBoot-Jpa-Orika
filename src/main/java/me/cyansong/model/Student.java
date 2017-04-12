package me.cyansong.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int Id;

    private String name;
    private String className;
    private double program;

    public void setId(int id) {
        Id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public void setProgram(double program) {
        this.program = program;
    }

    public int getId() {

        return Id;
    }

    public String getName() {
        return name;
    }

    public String getClassName() {
        return className;
    }

    public double getProgram() {
        return program;
    }
}
