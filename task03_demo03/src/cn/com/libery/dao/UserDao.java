package cn.com.libery.dao;

import cn.com.libery.model.User;
import cn.com.libery.utils.DbUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * @author: ymm
 * @date: 2022/7/8
 * @version: 1.0.0
 * @description:
 */
public interface UserDao {
    // 抽象方法，用于描述登录功能的实现
    public abstract User userLogin(User user);

}
