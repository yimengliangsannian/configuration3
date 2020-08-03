package cn.sz.dao;

import cn.sz.User;
import org.springframework.stereotype.Component;


public interface UserDao {
    User findById(Integer id);
}
