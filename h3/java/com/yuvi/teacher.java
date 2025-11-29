package com.yuvi;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class teacher {
    @Id
    private int Tid;
    private String Tname;
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
