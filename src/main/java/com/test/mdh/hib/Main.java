package com.test.mdh.hib;

import com.test.mdh.entity.UserEntity;
import com.test.mdh.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.sql.Timestamp;
import java.util.Date;
/**
 * Create by maodihui on 2020/12/29
 */
public class Main {
    public static void main(final String[] args) throws Exception {
        insert();
        selectByID();
    }

    private static void insert(){
        UserEntity userEntity = new UserEntity();
        userEntity.setId(1);
        userEntity.setName("10");
        userEntity.setAge(10);
        Timestamp timestamp = new Timestamp(new Date().getTime());
        userEntity.setCreateTime(timestamp);

        //打开一个普通的session
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.save(userEntity);
        userEntity.setAge(20);
        transaction.commit();
        session.close();
    }
    private static void selectByID(){
        //获取SessionFactory
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        //通过SessionFactory 获取 Session
        Session session = sessionFactory.openSession();
        //在Session基础上开启一个事务
        session.beginTransaction();
        UserEntity usersEntity = (UserEntity) session.get(UserEntity.class, 1);
        System.out.println(usersEntity.getCreateTime());
        session.close();

    }
}