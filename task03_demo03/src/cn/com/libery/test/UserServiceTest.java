package cn.com.libery.test;

import cn.com.libery.dao.UserDao;
import cn.com.libery.dao.impl.UserDaoImpl;
import cn.com.libery.model.User;
import cn.com.libery.service.UserService;
import org.junit.Test;

/**
 * @author: ymm
 * @date: 2022/7/10
 * @version: 1.0.0
 * @description:
 */
public class UserServiceTest {


    @Test
    public void testLogin(){
        UserDao userDao = new UserDaoImpl();
        UserService userService = new UserService();
        User user = userService.userLogin(new User("ymm", "123456"));
        System.out.println("Password() = " + user.getPassword());
    }
}
