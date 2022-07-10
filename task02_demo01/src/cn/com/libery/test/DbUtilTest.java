package cn.com.libery.test;

import cn.com.libery.utils.DbUtil;
import org.junit.Test;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * @author: ymm
 * @date: 2022/7/8
 * @version: 1.0.0
 * @description:
 */
public class DbUtilTest {

    @Test
    public void testRegister() throws SQLException {
        Connection connection = DbUtil.getConnection();
        String sql = "";
        connection.prepareStatement("");
    }
}
