package me.cyansong.model;

public class MappedStudent {
    private int Id;
    private String studentName;
    private String className;
    private double program;

    public void setId(int id) {
        Id = id;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
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

    public String getStudentName() {
        return studentName;
    }

    public String getClassName() {
        return className;
    }

    public double getProgram() {
        return program;
    }
}
