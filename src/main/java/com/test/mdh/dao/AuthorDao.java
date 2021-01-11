package com.test.mdh.dao;

import com.test.mdh.entity.AuthorDO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Create by maodihui on 2020/12/30
 */
@Repository
public interface AuthorDao extends JpaRepository<AuthorDO,Long> {


     List<AuthorDO> findAuthorDOByAccount(String accounter);

     List<AuthorDO> findAllByIdGreaterThan(Long id);

     @Query(nativeQuery = true,value = "select name from author where id = ?1")
     String findName(Long id);

     @Modifying
     @Transactional
     @Query(nativeQuery = true,value = "update author set name=:name,account=:account where id=:id")
     Integer updateAuthor(@Param("id") Long id, @Param("name") String name, @Param("account") String account);

}
