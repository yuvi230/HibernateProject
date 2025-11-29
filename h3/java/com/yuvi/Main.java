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
        s1.setsAge(30);



        SessionFactory sf = new Configuration()
                .configure()
                .addAnnotatedClass(com.yuvi.student.class)
                .buildSessionFactory();
        Session session = sf.openSession();
        s1 = session.find(student.class,106); // for read and delete
        Transaction transaction = session.beginTransaction();

        // session.merge(s1); for update
        session.remove(s1); // for delete operation

        transaction.commit();
        session.close();
        sf.close();
        System.out.println(s1);
    }
}
