package com.watchme.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.watchme.entity.User;
import com.watchme.mapper.UserMapper;
import com.watchme.service.IUserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Mengxy on 2018/7/25.
 */
@Service
@Transactional
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService{

    public List<User> qryAllUser(Map<String, Object> map) {
        Map<String,Object> columnMap = new HashMap<String,Object>();
        List<User> list = baseMapper.selectByMap(columnMap);
        return list;
    }
}
