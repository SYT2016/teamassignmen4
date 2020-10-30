package UserInterface.ManagerAirliners;

import com.eltima.components.ui.DatePicker;

import java.awt.*;
import java.util.Date;
import java.util.Locale;

public class DatePickerUtil {

    Date setDate;
    public static DatePicker getDatePicker() {
        final DatePicker datepick;
        // 格式
        String DefaultFormat = "yyyy-MM-dd HH:mm:ss";
        // 当前时间
        Date date = new Date();
        // 字体
        Font font = new Font("Times New Roman", Font.BOLD, 14);

        Dimension dimension = new Dimension(177, 24);

        int[] hilightDays = {1, 3, 5, 7};

        int[] disabledDays = {4, 6, 5, 9};
        //构造方法（初始时间，时间显示格式，字体，控件大小）
        datepick = new DatePicker(date, DefaultFormat, font, dimension);

        datepick.setLocation(137, 83);//设置起始位置
        /*
        //也可用setBounds()直接设置大小与位置
        datepick.setBounds(137, 83, 177, 24);
        */
        // 设置一个月份中需要高亮显示的日子
        datepick.setHightlightdays(hilightDays, Color.red);
        // 设置一个月份中不需要的日子，呈灰色显示
        datepick.setDisableddays(disabledDays);
        // 设置国家
        datepick.setLocale(Locale.US);
        // 设置时钟面板可见
        datepick.setTimePanleVisible(true);
        return datepick;
    }

    public void setDatePicker(DatePicker setdatepick, Date setDate) {
        //DatePicker setdatepick;
        //this.setdatepick = setdatepick;
        this.setDate = setDate;
        // 格式
        String DefaultFormat = "yyyy-MM-dd HH:mm:ss";
        // 当前时间
        Date date = new Date();
        // 字体
        Font font = new Font("Times New Roman", Font.BOLD, 14);

        Dimension dimension = new Dimension(177, 24);

        int[] hilightDays = {1, 3, 5, 7};

        int[] disabledDays = {4, 6, 5, 9};
        //构造方法（初始时间，时间显示格式，字体，控件大小）
        setdatepick = new DatePicker(setDate, DefaultFormat, font, dimension);

        setdatepick.setLocation(137, 83);//设置起始位置
        /*
        //也可用setBounds()直接设置大小与位置
        datepick.setBounds(137, 83, 177, 24);
        */
        // 设置一个月份中需要高亮显示的日子
        setdatepick.setHightlightdays(hilightDays, Color.red);
        // 设置一个月份中不需要的日子，呈灰色显示
        setdatepick.setDisableddays(disabledDays);
        // 设置国家
        setdatepick.setLocale(Locale.US);
        // 设置时钟面板可见
        setdatepick.setTimePanleVisible(true);
        //return datepick;
    }
}
