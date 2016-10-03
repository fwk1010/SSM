package com.ssm.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssm.dao.UserDao;
import com.ssm.model.User;
import com.ssm.service.UserService;
@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDao mUserDao;

	@Override
	public User getUserById(int id) {

		return mUserDao.getUserByUid(id);
	}

}
