package learn.basic;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

    public static void main(String[] arg) {

        // ApplicationContext is the central interface within a Spring application that is used for providing configuration information to the application
        // Application Context is Spring's advanced container. Similar to BeanFactory, it can load bean definitions, wire beans together, and dispense beans upon request.
        ApplicationContext cx = new ClassPathXmlApplicationContext("beans.xml");
        GreetingMessageService gms = cx.getBean("greetingMessageServiceImpl", GreetingMessageService.class);

        System.out.println(gms.greetUser());

    }
}
