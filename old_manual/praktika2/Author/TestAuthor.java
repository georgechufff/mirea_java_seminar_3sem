public class TestAuthor {
    public static void main(String[] args){
        Author a = new Author("tinkoff", "tinkoff@yandex.ru", 'm');
        System.out.println("Name: " + a.getName());
        System.out.println("Old email: " + a.getEmail());
        a.setEmail("geochuff@yandex.ru");
        System.out.println("New email: " + a.getEmail());
        System.out.print("Gender: ");
        if (a.getGender() == 'm'){
            System.out.println("male");
        }
        else if (a.getGender() == 'f'){
            System.out.println("female");
        }
        else{
            System.out.println("Attack helicopter Apache");
        }
    }
}