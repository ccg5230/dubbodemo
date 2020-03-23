package com.dubbo.impl;

import com.alibaba.dubbo.config.annotation.Reference;
import com.dubbo.api.UserService;
import com.dubbo.bean.UserAddress;
import com.dubbo.facde.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @className OrderServiceImpl
 * @Description
 * @Author chungaochen
 * Date 2020/3/14 19:46
 * Version 1.0
 **/
@Service //使用spring注解由Ioc生成bean，都表明这些类是要交给spring容器管理
public class OrderServiceImpl implements OrderService {

    //@Autowired 不能使用，因为spring Ioc容器管理的是托管的bean
    @Reference //使用@Reference引用服务
    private UserService userService;

/**   不使用spring的set注入
 * public void setUserService(UserService userService) {
        this.userService = userService;
   } */

    @Override
    public List<UserAddress> initOrder(String userId) {
        return userService.queryAllUserAddress(userId);
    }
}