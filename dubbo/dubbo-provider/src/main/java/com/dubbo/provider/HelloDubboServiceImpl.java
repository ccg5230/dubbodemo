package com.dubbo.provider;
import com.dubbo.api.HelloDubboService;

/**
 * @className HelloDubboServiceImpl
 * @Description 服务接口实现类（用于提供服务）
 * @Author chungaochen
 * Date 2020/3/13 15:59
 * Version 1.0
 **/
public class HelloDubboServiceImpl implements HelloDubboService {
    @Override
    public String helloDubbo(String str) {
        return "Welcome Dubbo: " + str;
    }
}