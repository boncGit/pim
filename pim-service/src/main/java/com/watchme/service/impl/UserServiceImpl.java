package com.watchme.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.watchme.entity.TbUser;
import com.watchme.mapper.UserMapper;
import com.watchme.service.IUserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Mengxy on 2018/7/25.
 */
@Service
@Transactional
public class UserServiceImpl extends ServiceImpl<UserMapper, TbUser> implements IUserService {

    public List<TbUser> qryAllUser(Map<String, Object> map) {
        Map<String,Object> columnMap = new HashMap<String,Object>();
        List<TbUser> list = baseMapper.selectByMap(columnMap);
        return list;
    }
}
