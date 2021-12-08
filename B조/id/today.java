package id;
import java.util.Date;
import java.text.SimpleDateFormat;

public class today {
     public static void main(String[]args){
       
        Date today = new Date(); 
        SimpleDateFormat a = new SimpleDateFormat("yyyyMMdd");
        String nowdate = a.format(today);
        System.out.println("오늘"+nowdate+"일입니다.");
        Dateld DateldTester = new Dateld(nowdate);
        DateldTester.plusda("a");
        DateldTester.plusda("b");
        DateldTester.plusda("c");

       
    }
}
