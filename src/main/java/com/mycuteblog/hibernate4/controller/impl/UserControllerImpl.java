package com.mycuteblog.hibernate4.controller.impl;

import com.mycuteblog.hibernate4.controller.UserController;
import com.mycuteblog.hibernate4.dao.UserDao;
import com.mycuteblog.hibernate4.model.User;
import org.springframework.beans.factory.annotation.Autowired;

import javax.transaction.Transactional;

/**
 * 
 * @author zhengwsa
 *
 */
@Transactional
public class UserControllerImpl implements UserController {

	@Autowired
	private UserDao userDao;

	@Override
	public boolean addUser(User user) {
		return userDao.addUser(user);
	}

	@Override
	public User getUser(long userId) {
		return userDao.getUser(userId);
	}

	@Override
	public boolean updateUser(User user) {
		return userDao.updateUser(user);
	}

	@Override
	public boolean deleteUser(User user) {
		return userDao.deleteUser(user);
	}
}
