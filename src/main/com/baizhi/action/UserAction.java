package com.baizhi.action;

import com.baizhi.entity.User;
import com.baizhi.service.UserService;

import java.util.List;

/**
 * Created by Administrator on 2018/6/8.
 */
public class UserAction implements UserService {
    public List<User> queryAll() {
        System.out.println("hhh第一次创建控制层");
        return null;
    }
}
