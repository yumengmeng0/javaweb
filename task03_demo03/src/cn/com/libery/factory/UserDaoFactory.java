package cn.com.libery.factory;

import cn.com.libery.dao.UserDao;
import cn.com.libery.dao.impl.UserDaoImpl;

/**
 * @author: ymm
 * @date: 2022/7/10
 * @version: 1.0.0
 * @description:
 */
public class UserDaoFactory {

    /**
     * 通过静态方法模式来实现UserDao实现类对象的创建并返回
     * @return
     */
    public static UserDao getUserDao() {
        return new UserDaoImpl();
    }

}
