package Util;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {

    public static String totYyyyMmDd(Date date) {
        DateFormat format = new SimpleDateFormat("YYYY-MM-dd");
        return format.format(date);
    }
}
