import java.text.SimpleDateFormat;
import java.util.Date;

public class Student {
    Date date;
    String name;

    Student(String name, Date date) {
        this.name = name;
        this.date = date;
    }

    public String toString(int choice) {
        String[] patterns = new String[]{"yyyy.MM.dd", "dd.MM.yy GGG", "EEE, d MMM yyyy"};
        String var1000 = this.name;
        return "Имя студента: " + var1000 + "\nДата рождения: " + (new SimpleDateFormat(patterns[choice - 1])).format(this.date);
    }
}
