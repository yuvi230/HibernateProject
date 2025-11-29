package com.yuvi;

import jakarta.persistence.*;

@Entity
@Table(name = "teacher_table")
public class teacher {
    @Id
    private int Tid;
    @Column(name = "Teacher_name")
    private String Tname;
    @Transient
    private int Tage;

    public int getTage() {
        return Tage;
    }

    public void setTage(int tage) {
        Tage = tage;
    }

    public String getTname() {
        return Tname;
    }

    public void setTname(String tname) {
        Tname = tname;
    }

    public int getTid() {
        return Tid;
    }

    public void setTid(int tid) {
        Tid = tid;
    }

    @Override
    public String toString() {
        return "teacher{" +
                "Tid=" + Tid +
                ", Tname='" + Tname + '\'' +
                ", Tage=" + Tage +
                '}';
    }
}
