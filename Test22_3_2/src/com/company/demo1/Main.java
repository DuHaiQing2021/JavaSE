package com.company.demo1;

public class Main {

    private String live;
    private int add;

    public String getLive() {
        return live;
    }

    public void setLive(String live) {
        this.live = live;
    }

    public int getAdd() {
        return add;
    }

    public void setAdd(int add) {
        this.add = add;
    }

    @Override
    public String toString() {
        return "Main{" +
                "live='" + live + '\'' +
                ", add=" + add +
                '}';
    }

    public Main(String live, int add) {
        this.live = live;
        this.add = add;
    }
}
