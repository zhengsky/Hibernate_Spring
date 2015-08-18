package com.mycuteblog.hibernate4.controller;

import com.mycuteblog.hibernate4.model.User;

/**
 * 
 * @author zhengwsa
 *
 */
public interface UserController {
    boolean addUser(User user);

    User getUser(long userId);

    boolean updateUser(User user);

    boolean deleteUser(User user);
}
