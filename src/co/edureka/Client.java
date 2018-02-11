package co.edureka;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Client {
    public static void main(String[] args){

        Employee eRef = new Employee();
        eRef.setEid(101);
        eRef.setEname("John Watson");
        eRef.setEaddress("Redwood Shores");

        System.out.println("Employee details: "+eRef);

        // Spring way
//        Resource resource = new ClassPathResource("employeebean.xml");
//        BeanFactory factory = new XmlBeanFactory(resource);

        ApplicationContext context = new ClassPathXmlApplicationContext("employeebean.xml");
        Employee e1 =(Employee)context.getBean("emp1");
        Employee e2 = context.getBean("emp2", Employee.class);


        System.out.println("Spring IOC in action");
        System.out.println("Employee details:" +e1);
        System.out.println("Employee details:" +e2);
    }

}
