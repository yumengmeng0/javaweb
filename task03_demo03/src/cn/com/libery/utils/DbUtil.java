package cn.com.libery.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * @author: ymm
 * @date: 2022/7/8
 * @version: 1.0.0
 * @description:
 */
public class DbUtil {
    private static String jdbcName;
    private static String dbUrl;
    private static String dbUserName;
    private static String dbPassword;

    static {
        jdbcName = "com.mysql.jdbc.Driver";
        dbUrl = "jdbc:mysql://localhost:3306/db_web";
        dbUserName = "root";
        dbPassword = "123456";
        try {
            Class.forName(jdbcName);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


    }

    /**
     * 获取链接
     *
     * @return
     * @throws SQLException
     */
    public static Connection getConnection() throws SQLException {
        Connection connection = DriverManager.getConnection(dbUrl, dbUserName, dbPassword);
        return connection;
    }

    /**
     * 关闭连接
     *
     * @param connection
     * @throws SQLException
     */
    public static void close(Connection connection, PreparedStatement preparedStatement) throws SQLException {
        if (connection != null) {
            connection.close();
        }

        if (preparedStatement != null) {
            preparedStatement.close();
        }
    }
}
