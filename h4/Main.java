package com.yuvi;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args){


          teacher t1 = new teacher();
          t1.setTname("Chandola");
          t1.setTage(47);
          t1.setTid(101);


        SessionFactory sf = new Configuration()
                .configure()
                .addAnnotatedClass(com.yuvi.teacher.class)
                .buildSessionFactory();
        Session session = sf.openSession();

        Transaction transaction = session.beginTransaction();


        session.persist(t1);
        transaction.commit();
        session.close();
        sf.close();
        System.out.println(t1);
    }
}
