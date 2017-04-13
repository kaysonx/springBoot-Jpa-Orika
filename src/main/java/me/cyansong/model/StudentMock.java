package me.cyansong.model;

public class StudentMock {
    private String strId;
    private String name;
    private String className;
    private double chinese;
    private double math;
    private double english;


    public StudentMock(String strId, String name, String className, double chinese, double math, double english) {
        this.strId = strId;
        this.name = name;
        this.className = className;
        this.chinese = chinese;
        this.math = math;
        this.english = english;
    }

    public void setStrId(String strId) {

        this.strId = strId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public void setChinese(double chinese) {
        this.chinese = chinese;
    }

    public void setMath(double math) {
        this.math = math;
    }

    public void setEnglish(double english) {
        this.english = english;
    }

    public String getStrId() {

        return strId;
    }

    public String getName() {
        return name;
    }

    public String getClassName() {
        return className;
    }

    public double getChinese() {
        return chinese;
    }

    public double getMath() {
        return math;
    }

    public double getEnglish() {
        return english;
    }
}
