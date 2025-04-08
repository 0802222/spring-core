package a_regist.a_xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Run {

    public static void main(String[] args) {
        //application context 객체 만들어보기
        ApplicationContext context = new ClassPathXmlApplicationContext(
            "/regist/xml/application-context.xml"
        );

        Book book = context.getBean("harrypoter", Book.class);
        System.out.println(book);

    }
}
