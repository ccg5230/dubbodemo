import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @className ProviderApplication
 * @Description 服务启动类
 * <P>
 *    源自官网快速启动 http://dubbo.apache.org/zh-cn/docs/user/quick-start.html
 * </P>
 * @Author chungaochen
 * Date 2020/3/13 16:02
 * Version 1.0
 **/
public class ProviderApplication {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("provider.xml");
        System.out.println(context.getDisplayName() + ": here");
        context.start();
        System.out.println("服务已经启动...");
        System.in.read();
    }
}