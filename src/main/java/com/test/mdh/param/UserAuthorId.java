package com.test.mdh.param;

import lombok.Data;

import java.io.Serializable;

/**
 * Create by maodihui on 2021/1/1
 */
@Data
public class UserAuthorId implements Serializable {

    private Long userId;

    private Long authorId;
}
