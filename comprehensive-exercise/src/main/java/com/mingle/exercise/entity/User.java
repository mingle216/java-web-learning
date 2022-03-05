package com.mingle.exercise.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author mingle
 * @date 2022/3/1 15:31
 * @description User实体类
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User {
    //id主键
    private Integer id;
    //用户名
    private String username;
    //密码
    private String password;
}
