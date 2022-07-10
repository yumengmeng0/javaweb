package cn.com.libery.dao.impl;

import cn.com.libery.dao.UserDao;
import cn.com.libery.model.User;
import cn.com.libery.utils.DbUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author: ymm
 * @date: 2022/7/8
 * @version: 1.0.0
 * @description:
 */
public class UserDaoImpl implements UserDao {

    public int createUser(User user) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        int row = 0;

        try {

            connection = DbUtil.getConnection();
            String sql = "insert into t_user values(null, ?, ?)";
            preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setString(1, user.getUserName());
            preparedStatement.setString(2, user.getPassword());
            row = preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                DbUtil.close(connection, preparedStatement);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return row;
    }

    @Override
    public User userLogin(User user) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {
            connection = DbUtil.getConnection();
            String sql = "select * from t_user where userName = ? and password = ?";
            preparedStatement = connection.prepareStatement(sql);


            preparedStatement.setString(1, user.getUserName());
            preparedStatement.setString(2, user.getPassword());
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                User user1 = new User(resultSet.getString("userName"), resultSet.getString("password"));
                return user1;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                DbUtil.close(connection, preparedStatement);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return null;
    }
}
