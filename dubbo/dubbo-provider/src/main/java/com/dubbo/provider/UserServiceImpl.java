package com.dubbo.provider;

import com.alibaba.dubbo.config.annotation.Service;
import com.dubbo.api.UserService;
import com.dubbo.bean.UserAddress;

import java.util.ArrayList;
import java.util.List;

/**
 * @className UserServiceImpl
 * @Description
 * @Author chungaochen
 * Date 2020/3/14 19:10
 * Version 1.0
 **/
@Service //com.alibaba.dubbo.config.annotation.Service 声明该类是服务的提供者的注解,对外暴露服务
public class UserServiceImpl implements UserService {

    public static List<UserAddress> addresses = new ArrayList<>();

    static {
        addresses.add(new UserAddress(1L,"湖北省武汉市江汉区百步亭小区被坑佳苑C块48号103室","受害人","no1"));
        addresses.add(new UserAddress(2L,"上海市浦东新区示范园区288弄388号305室","大哥大","no1"));
    }

    @Override
    public List<UserAddress> queryAllUserAddress(String userId) {
        return addresses;
    }
}