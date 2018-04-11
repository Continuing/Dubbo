import com.dubboStu.api.DemoService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class ConsumerApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("consumer.xml");
        context.start();
        System.out.println("Dubbo consumer start...");
        DemoService demoService =  (DemoService)context.getBean("demoService");


        System.out.println(demoService.sayHello("哈哈哈哈"));

        System.out.println(demoService.sayHello("您好"));

        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
