import com.snow.provider.service.DemoService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Leo. on 2018/4/18.
 */
public class ConsumerMain {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring/applicationSpring.xml");
        context.start();
        DemoService demoService = (DemoService)context.getBean("demoService");
        String result = demoService.sayHello("国际惯例");
        System.out.println(result);
        context.close();

    }
}
