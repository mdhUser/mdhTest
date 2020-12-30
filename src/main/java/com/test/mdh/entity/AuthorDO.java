package com.test.mdh.entity;

import lombok.CustomLog;
import lombok.Data;

import javax.persistence.*;

/**
 * Create by maodihui on 2020/12/29
 */
@Entity
@Table(name = "author")
@Data
public class AuthorDO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 30)
    private String name;
    @Column(length = 32)
    private String account;
    @Column(length = 64)
    private String book;
    @Column(length = 64)
    private String pwd;


}
