package ex6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Email {

    public static boolean isCorrectEmail(String s){
        Matcher m = Pattern.compile(
                "[a-zA-Z0-9]+[a-zA-Z0-9!#$%&'*+\\-/=?^_`{|}~.]*@[a-zA-Z0-9\\-_.]+\\.[a-zA-Z]+"
        ).matcher(s);
        return m.find() && m.group().equals(s);
    }

    public static void main(String [] args){
        System.out.println(isCorrectEmail("user@example.com"));
        System.out.println(isCorrectEmail("root@localhost.com"));
        System.out.println(isCorrectEmail("myhost@@@com.ru"));
        System.out.println(isCorrectEmail("@my.ru,"));
        System.out.println(isCorrectEmail("kalinin@g@mail.ru"));
    }
}