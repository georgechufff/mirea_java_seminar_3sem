package ex5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Date {

    public static boolean iscorrectDate(String s){
        Matcher m = Pattern.compile(
                "((29/02/((19([2468][048])|([13579][26])|(0[48]))|([2-9]\\d([2468][048])|([13579][26]))|([2468][048]00)|([3579][26]00)))|((2[0-8]/02/((19\\d\\d)|([2-9]\\d{3}))))|(((0?\\d)|([12]\\d)|(3[01]))/((0?[013456789])|(1[12]))/((19\\d\\d)|([2-9]\\d{3}))))"
        ).matcher(s);
        return m.find() && m.group().equals(s);
    }

    public static void main(String [] args){
        System.out.println(iscorrectDate("29/02/2001"));
        System.out.println(iscorrectDate("1/1/1923"));
        System.out.println(iscorrectDate("1/1/1345"));
    }
}