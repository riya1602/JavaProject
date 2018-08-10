package pgms;

/**
 * Created by expert on 20/7/18.
 */

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;
import  java.util.Date.*;
public class DateEx {
    public static void main(String[] args) {
        Date  today;
        SimpleDateFormat sdf;
        today=new Date();
        sdf=new SimpleDateFormat("MM/dd/yy");
        System.out.println(sdf.format(today));

        LocalDate date=LocalDate.now();
        System.out.println(date);
        LocalTime time=LocalTime.now();
        System.out.println(time);
        LocalDateTime dt=LocalDateTime.now();
        System.out.println(dt);

    }
}
