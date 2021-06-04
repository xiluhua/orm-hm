package com.ramostear.hm.orm.mybatis;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ramostear.hm.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by Ramostear on 2019/6/6 0006.
 */
@Component
@Mapper
public interface UserMapper extends BaseMapper<User>{

    User selectByUserId(Long id);

    List<User> selectAllUser();

}
