package com.dubbo.consumer;

import com.dubbo.bean.UserAddress;
import com.dubbo.facde.OrderService;
import net.sf.ehcache.search.expression.Or;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.dubbo.api.HelloDubboService;

import java.util.Iterator;
import java.util.List;

/**
 * @className ConsumerTest
 * @Description 测试服务消费者获取服务接口
 * <P>
 *    源自官网快速启动 http://dubbo.apache.org/zh-cn/docs/user/quick-start.html
 * </P>
 * @Author chungaochen
 * Date 2020/3/13 16:08
 * Version 1.0
 **/
public class ConsumerTest {

    public static void main(String[] args) {
        //测试常规服务
        ApplicationContext context =
        //ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("consumer.xml");
        //context.start();
        System.out.println("consumer start");
        HelloDubboService demoService = context.getBean(HelloDubboService.class);// 获取远程服务代理
        OrderService orderService = context.getBean(OrderService.class);
        System.out.println(demoService.helloDubbo("dubbo"));// 执行远程方法
        List<UserAddress> l = orderService.initOrder("test");
        Iterator it = l.iterator();
        while (it.hasNext()) {
            System.out. println(it.next());
        }
    }

}