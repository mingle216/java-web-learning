package com.mingle.exercise.mapper;

import com.mingle.exercise.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * @author mingle
 * @date 2022/3/1 15:51
 * @description UserMapper
 */
public interface UserMapper {
    /**
     * 根据用户名和密码查询用户对象
     *
     * @param username 用户名
     * @param password 密码
     * @return user
     */
    @Select("SELECT * FROM tb_user WHERE username = #{username} AND password = #{password} ")
    User findUser(@Param("username") String username, @Param("password") String password);

    /**
     * @return  查询到的用户对象
     * @param username 用户名
     * @description 根据用户名查询用户对象
     */
    @Select("SELECT * FROM tb_user WHERE username = #{username} ")
    User selectByUsername(String username);

    //添加用户  user为用户对象
    @Insert("INSERT INTO tb_user VALUES (null,#{username},#{password})")
    void add(User user);


}