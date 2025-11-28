package com.yuvi;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class student {
    @Id
    private int rollno;
    private String sname;
    private int sAge;

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public int getsAge() {
        return sAge;
    }

    public void setsAge(int sAge) {
        this.sAge = sAge;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    @Override
    public String toString() {
        return "student{" +
                "rollno=" + rollno +
                ", sname='" + sname + '\'' +
                ", sAge=" + sAge +
                '}';
    }
}
