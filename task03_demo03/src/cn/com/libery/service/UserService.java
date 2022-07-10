package cn.com.libery.service;

import cn.com.libery.dao.UserDao;
import cn.com.libery.factory.UserDaoFactory;
import cn.com.libery.model.User;

/**
 * @author: ymm
 * @date: 2022/7/10
 * @version: 1.0.0
 * @description:
 */
public class UserService {
    private UserDao userDao;

    public UserService() {
        this.userDao = UserDaoFactory.getUserDao();
    }

    public User userLogin(User user) {
        return userDao.userLogin(user);
    }
}
