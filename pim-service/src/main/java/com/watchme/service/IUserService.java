package com.watchme.service;

import com.baomidou.mybatisplus.service.IService;
import com.watchme.entity.User;

import java.util.List;
import java.util.Map;

/**
 * Created by Mengxy on 2018/7/25.
 */
public interface IUserService extends IService<User> {

     List<User> qryAllUser (Map<String,Object> map);
}
