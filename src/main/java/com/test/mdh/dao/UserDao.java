package com.test.mdh.dao;

import com.test.mdh.entity.UserDO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Create by maodihui on 2020/12/30
 */
@Repository
public interface UserDao extends JpaRepository<UserDO,Long> {


}
