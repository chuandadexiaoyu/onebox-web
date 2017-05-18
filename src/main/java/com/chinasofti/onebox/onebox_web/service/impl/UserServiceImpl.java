package com.chinasofti.onebox.onebox_web.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chinasofti.onebox.onebox_web.IDao.UserDao;
import com.chinasofti.onebox.onebox_web.domain.User;
import com.chinasofti.onebox.onebox_web.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;

	public User getUserById(int userId) {
		return userDao.selectByPrimaryKey(userId);
	}

}
