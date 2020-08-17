package com.qf.pojo.req;

import lombok.Data;

/**
 * Created by 54110 on 2020/8/17.
 */
@Data
public class UserReq {
    private String userName;

    private String email;

    private String code;

    private String password;
}
