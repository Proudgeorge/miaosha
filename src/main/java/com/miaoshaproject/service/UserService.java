package com.miaoshaproject.service;

import com.miaoshaproject.error.BusinessException;
import com.miaoshaproject.service.model.UserModel;

/**
 * @author simba@onlying.cn
 * @date 2019/7/4 10:20
 */
public interface UserService {

    //通过用户id获取用户对象的方法
    UserModel getUserByid(Integer id);
    void register(UserModel userModel) throws BusinessException;
    /*
    * telephone:用户注册手机
    * password：用户加密后的密码
    * */
    UserModel validateLogin(String telephone,String encrptPassword) throws BusinessException;
}
