package com.test.mdh.dao;

import com.test.mdh.entity.AuthorDO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Create by maodihui on 2020/12/30
 */
@Repository
public interface AuthorDao extends JpaRepository<AuthorDO,Long> {


}
