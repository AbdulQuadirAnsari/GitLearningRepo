package com.telusko;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class Main {
    public static void main() {
        //Alien a1 = new Alien();
        //a1.setAid(103);
        //a1.setName("Kiran");
        //a1.setTech("Gen AI");

        Configuration config = new Configuration();
        config.addAnnotatedClass(com.telusko.Alien.class);
        config.configure("hibernate.cfg.xml");

        SessionFactory factory = config.buildSessionFactory();

        Session session = factory.openSession();

        Alien a1 = session.find(Alien.class, 103);
        System.out.println(a1);

        session.close();
        factory.close();

    }
}
