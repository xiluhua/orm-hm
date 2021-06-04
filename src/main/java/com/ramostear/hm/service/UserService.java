package com.ramostear.hm.service;

import com.ramostear.hm.model.User;

import java.util.List;

/**
 * Created by Ramostear on 2019/6/6 0006.
 */
public interface UserService {

    User save(User user);

    User save2(User user);

    User findById(Long id);

    User findById2(Long id);

    List<User> findAll();
}
