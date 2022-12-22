import java.lang.*;
public class Book {
    private String name;
    private int count_of_pages;
    public Book(){
        name = "Crime and punishment";
        count_of_pages = 568;
    }
    public Book(String name, int count_of_pages){
        this.name = name;
        this.count_of_pages = count_of_pages;
    }
    public Book(String name){
        this.name = name;
    }
    public Book(int count_of_pages){
        this.count_of_pages = count_of_pages;
    }
    public void SetName(String name){
        this.name = name;
    }
    public void SetCount(int count_of_pages){
        this.count_of_pages = count_of_pages;
    }
    public String toString(){
        return "Book with the name '" + name + "' has " + count_of_pages + " pages";
    }
    public void Tester(){
        System.out.println("Book with the name '" + name + "' has " + count_of_pages + " pages");
    }
}
