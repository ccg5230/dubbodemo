package com.dubbo.api;

import com.dubbo.bean.UserAddress;
import com.dubbo.bean.UserAddress;

import java.util.List;

/**
 * @className UserService
 * @Description
 * @Author chungaochen
 * Date 2020/3/14 18:55
 * Version 1.0
 **/
public interface UserService {

    /**
     * @Author chungaochen
     * @Description  查询所有用户地址
     * @Date 19:10 19:10
     * @Param [] 
     * @return java.util.List<com.dubbo.bean.UserAddress>
     **/
    public List<UserAddress> queryAllUserAddress(String userId);
}
