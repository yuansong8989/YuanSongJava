package com.springys.entity;

import lombok.Data;

import javax.persistence.*;

/**
 * Created by yzd on 2019/2/18.
 */
@Data
@Entity
@Table(name = "student")
public class Students {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String password;
    private int uid;
}
