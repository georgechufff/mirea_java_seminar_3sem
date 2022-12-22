package ex1;

import java.util.ArrayList;
import java.util.Scanner;

public class MVCPatternDemo {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Введите количество строк: ");
        int n = in.nextInt();
        ArrayList<Student>  list = new ArrayList<Student>();
        for (int i = 0; i < n; i++){
            Student model = retrieveStudentFromDatabase();
            list.add(model);
        }
        for (Student s : list){
            StudentView view = new StudentView();
            StudentController controller = new StudentController(s, view);
            controller.updateView();
        }
    }
    private static Student retrieveStudentFromDatabase(){
        Scanner in = new Scanner(System.in);
        Student Student = new Student();
        System.out.print("Введите имя: ");
        String name = in.nextLine();
        System.out.print("Введите роль: ");
        String RollNo = in.nextLine();
        Student.setName(name);
        Student.setRollNo(RollNo);
        return Student;
    }
}
