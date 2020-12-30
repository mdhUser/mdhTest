package com.test.mdh.hib;

import com.test.mdh.dao.AuthorDao;
import com.test.mdh.entity.AuthorDO;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Create by maodihui on 2020/12/29
 */

public class Test {
    @Autowired
    private AuthorDao authorDao;

    public void addTest(){
        AuthorDO authorDO =new AuthorDO();
        authorDO.setAccount("jdsk");
        authorDO.setBook("十日谈");
        authorDO.setPwd("ndish134");
        authorDao.save(authorDO);
    }

    public static void main(String[] args) {
         Test test = new Test();
         test.addTest();
    }

}
