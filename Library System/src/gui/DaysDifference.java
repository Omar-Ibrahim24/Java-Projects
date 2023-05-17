package gui;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class  DaysDifference {
    public static long findDayDifference(String start_date,String end_date) {
        SimpleDateFormat sdf= new SimpleDateFormat("yyyy/MM/dd");
        long DiffDays = 0;
        try {
            Date d1 = sdf.parse(start_date);
            Date d2 = sdf.parse(end_date);

            long difference_In_Time= d2.getTime() - d1.getTime();


             DiffDays= (difference_In_Time/ (1000 * 60 * 60 * 24))% 365;

        } 
        catch (ParseException e) {
        }
return DiffDays;
    }


}
