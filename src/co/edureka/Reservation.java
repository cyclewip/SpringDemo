package co.edureka;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Reservation {

//    Room room;
//    Date date;
//    SimpleDateFormat simpleDateFormat;
    String startDay;
    String endDay;

    public Reservation() {
    }

//    public Room getRoom() {
//        return room;
//    }
//
//    public void setRoom(Room room) {
//        this.room = room;
//    }

//    public Date getDate() {
//        return date;

    @Override
    public String toString() {
        return "Reservation{" +
                "startDay='" + startDay + '\'' +
                ", endDay='" + endDay + '\'' +
                '}';
    }
//    }
//
//    public void setDate(Date date) {
//        this.date = date;
//    }
//
//    public SimpleDateFormat getSimpleDateFormat() {
//        return simpleDateFormat;
//    }
//
//    public void setSimpleDateFormat(SimpleDateFormat simpleDateFormat) {
//        this.simpleDateFormat = simpleDateFormat;
//    }

    public String getStartDay() {
        return startDay;
    }

    public void setStartDay(String startDay) {
        this.startDay = startDay;
    }

    public String getEndDay() {
        return endDay;
    }

    public void setEndDay(String endDay) {
        this.endDay = endDay;
    }

//    public Reservation(Room room, String startDay, String endDay){
//    this.room = room;
//    this.startDay = startDay;
//    this.endDay = endDay;
//
//
//    }

//    public void reserveHotel(){
//
//
//        simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
//        try{
//            date = simpleDateFormat.parse(startDay);
//
//
//
//        }catch (ParseException e){
//            System.out.println("Couldnt parse value" + simpleDateFormat);
//        }
//
//    }

}
