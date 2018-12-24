package domain;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Provider {
    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:provider.xml");
        context.start();
        System.out.println("aaaa");
        System.out.println("aaaa");

        System.out.println("新分支");

        System.out.println("bbb");
        System.in.read();
    }
}
