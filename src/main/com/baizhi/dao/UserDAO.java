package com.baizhi.dao;

import com.baizhi.entity.User;

import java.util.List;

/**
 * Created by Administrator on 2018/6/8.
 */
public interface UserDAO {
    List<User> queryAll();
    User queryByName(String username);
}
