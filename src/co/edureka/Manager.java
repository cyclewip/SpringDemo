package co.edureka;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Manager {
    Map<Room, List<BookDate>> roomsMap;
    List<BookDate> bookDates;
    private int nrOfDaysFeb = 28;
    ApplicationContext context = new ClassPathXmlApplicationContext("Bean.xml");

    String february = "201802";

    public static void main(String[] args) {
        Manager manager = new Manager();
        manager.load();
        manager.createRooms();

    }

    public void load() {

        Reservation r1 = (Reservation) context.getBean("res1");

//
//        Employee e1 =(Employee)context.getBean("emp1");
//        Employee e2 = context.getBean("emp2", Employee.class);


//        System.out.println("Spring IOC in action");
//        System.out.println("Employee details:" +e1);
//        System.out.println("Employee details:" +e2);

        System.out.println("First reservation made: " + r1);
    }

    public void reservation(String startDate, String endDate) {
        int endAndStartDate = 0;

        for (Map.Entry<Room, List<BookDate>> entry : roomsMap.entrySet()) {
            for (int i = 0; i < entry.getValue().size(); i++) {
                if (entry.getValue().get(i).date.contains(startDate)) {
                    if (!entry.getValue().get(i).booked) {
                        endAndStartDate++;
                    }
                }
                if (entry.getValue().get(i).date.contains(endDate)) {
                    if (!entry.getValue().get(i).booked) {
                        endAndStartDate++;
                    }
                }
                if(endAndStartDate == 2){

                    break;
                }
            }


        }
    }


    public void createRooms() {
        List<String> days;
        bookDates = new ArrayList<>();
        roomsMap = new LinkedHashMap<>();
        for (int i = 0; i < 10; i++) {
            days = new ArrayList<>();
            for (int y = 0; y < nrOfDaysFeb; y++) {
                String yTemp = Integer.toString(y);
                if (y < 10) {
                    bookDates.add(new BookDate(february + "0" + yTemp));
                } else {
                    bookDates.add(new BookDate(february + yTemp));
                }
            }

            roomsMap.put(new Room(i, "Single"), bookDates);
        }
        int i = 0;
    }
}
