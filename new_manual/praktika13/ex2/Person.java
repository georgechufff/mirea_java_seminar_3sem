package ex2;

public class Person {
    private String name, surname, patronymic;

    public Person(String surname) {
        this.surname = surname;
    }

    public Person(String name, String surname, String patronymic) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
    }

    public String getFullName(){
        StringBuilder sb = new StringBuilder(surname);
        if(name != null && ! name.equals(""))
            sb.append(" ").append(name);
        if(patronymic != null && ! patronymic.equals(""))
            sb.append(" ").append(patronymic);
        return sb.toString();
    }

    public static void main(String[] args) {
        Person p1 = new Person("Чуфистов");
        Person p2 = new Person("Георгий", "Чуифстов", "");
        Person p3 = new Person("Георгий", "Чуфистов", "Александрович");
        System.out.println(p1.getFullName());
        System.out.println(p2.getFullName());
        System.out.println(p3.getFullName());
    }
}