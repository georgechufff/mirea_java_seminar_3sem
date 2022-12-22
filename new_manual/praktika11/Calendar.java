import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;

public class Calendar {
    private ArrayList<Date> dates;

    public Calendar(){
        dates = new ArrayList<Date>();
    }
    public void add_date(String date) throws ParseException {
        Date res = (new SimpleDateFormat("y-M-d")).parse(date);
        System.out.println(res);
        dates.add(res);
    }
    public void show_dates(){
        for (Date s : dates){
            System.out.println((new SimpleDateFormat("yyyy.MM.dd").format(s)));
        }
    }
}
