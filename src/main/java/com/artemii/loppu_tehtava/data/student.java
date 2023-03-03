package com.artemii.loppu_tehtava.data;

public class student {
      public int id;
    private String fname;
    private String lname;
    private int classNum;

    public student() {
    }

    public student(int id, String fname, String lname, int classNum) {
        this.id = id;
        this.fname = fname;
        this.lname = lname;
        this.classNum = classNum;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFname() {
        return this.fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return this.lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public int getClassNum() {
        return this.classNum;
    }

    public void setClassNum(int classNum) {
        this.classNum = classNum;
    }
}
