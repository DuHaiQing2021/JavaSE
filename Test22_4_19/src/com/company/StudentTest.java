package com.company;

public class StudentTest {
    private String name;
    private String classId;
    private double score;

    public StudentTest(String name,String classId,double score){
        this.name=name;
        this.classId=classId;
        this.score=score;
    }

    public String getName() {
        return name;
    }

    public String getClassId() {
        return classId;
    }

    public double getScore() {
        return score;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setClassId(String classId) {
        this.classId = classId;
    }

    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "StudentTest{" +
                "name='" + name + '\'' +
                ", classId='" + classId + '\'' +
                ", score=" + score +
                '}';
    }
}
