package com.zhang.jiwei.dao.impl;

import com.zhang.jiwei.dao.UserDao;
import com.zhang.jiwei.entity.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

/**
 * @author jiwei.zhang
 * @DATE 2017/12/18 0018
 */
@Repository
public class UserDaoImpl implements UserDao {

    private static final Logger logger = LoggerFactory.getLogger(UserDaoImpl.class);

    public User queryUserById(int id) {
        logger.info("UserDaoImpl id:{}", id);
        return new User(id, "name" + id, id + 15);
    }
}
