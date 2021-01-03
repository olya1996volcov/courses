package ru.otus.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;
import ru.otus.spring.service.IOService;
import ru.otus.spring.service.IOServiceImpl;

@ComponentScan
@Component
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(Main.class);
        IOService service = context.getBean(IOServiceImpl.class);
        service.testUser();
    }
}
