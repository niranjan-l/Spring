package util;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	
public static void main(String[] args) {
	String springConfig="util/bean.xml";
	
ApplicationContext context     = new ClassPathXmlApplicationContext(springConfig);
SampleVO obj=(SampleVO) context.getBean("SampleVO");
obj.getHello();
System.out.println("hey this is niranjan");

System.out.println("Master stream");
System.out.println("Master  niranjan");
System.out.println("This is relase 1.0 f");

System.out.println("This is relase 1.0 f");


}
}
