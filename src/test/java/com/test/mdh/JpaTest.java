package com.test.mdh;

import com.test.mdh.dao.AuthorDao;
import com.test.mdh.entity.AuthorDO;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * Create by maodihui on 2020/12/30
 */
@SpringBootTest
public class JpaTest {

    @Autowired
    private AuthorDao authorDao;


    @Before
    public void create() {
        AuthorDO authorDO = new AuthorDO();
        authorDO.setAccount("jdsk");
        authorDO.setBook("十日谈");
        authorDO.setPwd("ndish134");
        authorDO.setId(2L);
        authorDao.save(authorDO);

        AuthorDO authorDO2 = new AuthorDO();
        authorDO2.setAccount("jdsk");
        authorDO2.setBook("十日谈");
        authorDO2.setPwd("ndish134");
        authorDao.save(authorDO2);

        AuthorDO authorDO3 = new AuthorDO();
        authorDO3.setAccount("jdsk");
        authorDO3.setBook("十日谈");
        authorDO3.setPwd("ndish134");
        authorDao.save(authorDO3);

        AuthorDO authorDO4 = new AuthorDO();
        authorDO4.setAccount("jdsk");
        authorDO4.setBook("十日谈");
        authorDO4.setPwd("ndish134");
        authorDao.save(authorDO4);
    }

    @Test
    public void addTest(){
        AuthorDO authorDO =new AuthorDO();
        authorDO.setAccount("jdsk");
        authorDO.setBook("十日谈");
        authorDO.setPwd("ndish134");
        authorDao.save(authorDO);

    }



}
