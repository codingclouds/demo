package com.example.demo.service;

/**
 * @ Author     : wzt.
 * @ Date       : Created in 11:03 2019/7/10
 * @ Description: 操作用户表
 * @ Modified By:
 * @ Version    : 1.0$
 */
public interface UserService {

    /**
     *  新增一个用户
     * @param name
     * @param age
     */
    void create(String name ,int age);

    /**
     * 根据name删除用户
     * @param name
     */
    void deleteByName(String name);

    /**
     * 获取用户总量
     * @return
     */
    int getAllUser();

    /**
     * 删除所有用户
     */
    void deleteAllUser();

}
