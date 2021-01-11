package com.test.mdh.entity;

import com.test.mdh.param.UserAuthorId;
import lombok.Data;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

/**
 * Create by maodihui on 2021/1/1
 */
@Data
@Entity
@Table(name = "user_author_id")
@IdClass(UserAuthorId.class)
public class UserAuthIdDO {

    @Id
    private Long userId;
    @Id
    private Long authorId;


}
