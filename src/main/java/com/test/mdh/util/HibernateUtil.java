package com.test.mdh.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Create by maodihui on 2020/12/28
 */
public class HibernateUtil {
    private static SessionFactory sessionFactory;

    static {

        try {
            sessionFactory = new Configuration().configure().buildSessionFactory();

        } catch (Throwable a) {
            throw new ExceptionInInitializerError(a);
        }
    }
     public static SessionFactory getSessionFactory(){
            return sessionFactory;
        }

     public static void shutdown(){
        getSessionFactory().close();
     }

}
