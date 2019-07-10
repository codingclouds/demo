package com.example.demo.service.impl;

import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

/**
 * @ Author     : wzt.
 * @ Date       : Created in 11:07 2019/7/10
 * @ Description: UserService实现类
 * @ Modified By:
 * @ Version    : 1.0$
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void create(String name, int age) {
        jdbcTemplate.update("insert into user (name,age)values (?,?)",name,age);
    }

    @Override
    public void deleteByName(String name) {
        jdbcTemplate.update("delete from user where name =?",name);
    }

    @Override
    public int getAllUser() {
        return jdbcTemplate.queryForObject("select count(1) from user",Integer.class);
    }

    @Override
    public void deleteAllUser() {
        jdbcTemplate.update("delete from user");
    }
}
