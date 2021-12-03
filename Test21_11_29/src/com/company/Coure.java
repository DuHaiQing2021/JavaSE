package com.company;

public class Coure {
    private String name;
    private String score;

    @Override
    public String toString() {
        return "Coure{" +
                "name='" + name + '\'' +
                ", score='" + score + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public Coure(String name, String score) {
        this.name = name;
        this.score = score;
    }
}
