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
public class UserDao {

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
}
