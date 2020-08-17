package com.qf.pojo;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by 54110 on 2020/8/17.
 */
@Entity
@Data
@Table(name = "tb_user")
public class User {

    @Id
    private Integer id;
    @Column(name = "username")
    private String userName;

    private String address;

    private String imageurl;
}
