package ex2;

import ex1.Student;
import ex1.StudentController;
import ex1.StudentView;

import java.util.ArrayList;
import java.util.Scanner;

public class MVCPatternDemo {
    static Scanner sc = new Scanner(System.in);
    public static void main(String [] args){
        System.out.print("Введите количество строк: ");
        int n = sc.nextInt();
        ArrayList<Employee> list = new ArrayList<Employee>();
        for (int i = 0; i < n; i++){
            Employee model = retrieveEmployeeFromDatabase();
            list.add(model);
        }

        for (Employee e : list){
            EmployeeView view = new EmployeeView();
            EmployeeController controller = new EmployeeController(e, view);
            //StudentController controller = new StudentController(s, view);
            controller.updateView();
        }
        /*
        controller.updateView();
        controller.setEmployeeName("Sasha");
        controller.setEmployeeWages(1000);
        System.out.println("\nAfter updating, Employee Details are as follows");
        controller.updateView();
        */
    }
    private static Employee retrieveEmployeeFromDatabase(){

        Employee Employee = new Employee();

        System.out.print("Введите имя: ");
        String name = sc.next();

        System.out.print("Введите зарплату: ");
        int fee = sc.nextInt();

        Employee.setName(name);
        Employee.setWages(fee);

        return Employee;

    }
}