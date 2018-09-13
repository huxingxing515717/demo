package factorytest;

import com.zccoder.demo.redis.mq.factory.proxy.ProxyProducer;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Map;
import java.util.Set;

public class Test {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
        UserService userService = applicationContext.getBean(UserService.class);
        userService.create("Hey");
        userService.delete("Hey");
        userService.query("Hey");

        Map<String, ProxyProducer> producerMap = applicationContext.getBeansOfType(ProxyProducer.class);
        Set<String> keySet = producerMap.keySet();
        for (String key : keySet) {
            System.out.println("Bean ID[" + key + "]；Value[" +producerMap.get(key)+"]");
        }
    }
}
