package com.yuvi;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args){
        student s1 = new student();
        s1.setRollno(105);
        s1.setSname("ursha");
        s1.setsAge(35);

//        Configuration cfg = new Configuration();
//
//        cfg.addAnnotatedClass(student.class);
//        cfg.configure("hibernate.cfg.xml");

        // after refactoring
        SessionFactory sf = new Configuration()//cfg.buildSessionFactory();
                .configure()
                .addAnnotatedClass(com.yuvi.student.class)
                .buildSessionFactory();
        Session session = sf.openSession();
        Transaction transaction = session.beginTransaction();

        session.persist(s1);

        transaction.commit();
        session.close();
        sf.close();
        System.out.println(s1);
    }
}
