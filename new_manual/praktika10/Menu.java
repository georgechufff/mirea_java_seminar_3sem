package ex1;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

    public static Student[] setArray(String type_of_sorting) {
        if (type_of_sorting.equals("qsort")){
            return new Student[]{
                    new Student("Георгий", "Чуфистов",
                            "программист", 2, "ИКБО-04-21"),
                    new Student("Александр", "Пушкин",
                            "ментор", 2, "ИКБО-04-21"),
                    new Student("Владимир", "Маяковский",
                            "доктор", 4, "ИКБО-01-19")
            };
        }
        else if (type_of_sorting.equals("msort")){
            return new Student[]{
                    new Student("Максим", "Кац",
                            "урбанист", 2, "ИКБО-06-21"),
                    new Student("Анатолий", "Артамонов",
                            "гигачад", 4, "ИКБО-02-10")
            };
        }
        else{
            throw new IllegalArgumentException("Такая сортировка не существует или недоступна");
        }
    }

    private static SortingStudentByField comp = new SortingStudentByField();
    public static void qSort(Object[] array, int high, int low, String field){
        if(array == null || array.length == 0) return;
        if(high <= low) return;

        Object middle = array[(low + high)/2];
        ArrayList<Object> left = new ArrayList<>();
        ArrayList<Object> right = new ArrayList<>();
        ArrayList<Object> eq = new ArrayList<>();
        for(int i = low; i <= high; i++){
            if(comp.compare(array[i], middle, field) > 0){
                right.add(array[i]);
            }
            else if (comp.compare(array[i], middle, field) < 0)
                left.add(array[i]);
            else eq.add(array[i]);
        }
        Object[] leftArr;
        Object[] rightArr;
        if(left.size() > 0) {
            leftArr = left.toArray();
            qSort(leftArr, left.size() - 1, 0, field);
            System.arraycopy(leftArr, 0, array, low, left.size());
        }
        System.arraycopy(eq.toArray(), 0, array, low+left.size(), eq.size());

        if(right.size() > 0) {
            rightArr = right.toArray();
            qSort(rightArr, right.size() - 1, 0, field);
            System.arraycopy(rightArr, 0, array, low+left.size() + eq.size(), right.size());
        }
    }

    public static void mergeSort(Student[] a, int n, String field) {
        if (n < 2) {
            return;
        }
        int mid = n / 2;
        Student[] l = new Student[mid];
        Student[] r = new Student[n - mid];

        System.arraycopy(a, 0, l, 0, mid);
        System.arraycopy(a, mid, r, 0, n - mid);
        mergeSort(l, mid, field);
        mergeSort(r, n - mid, field);

        merge(a, l, r, mid, n - mid, field);
    }
    public static void merge(
            Student[] a, Student[] l, Student[] r, int left, int right, String field) {

        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            if (comp.compare(l[i], r[j], field) <= 0) {
                a[k++] = l[i++];
            }
            else {
                a[k++] = r[j++];
            }
        }
        while (i < left) {
            a[k++] = l[i++];
        }
        while (j < right) {
            a[k++] = r[j++];
        }
    }

    public static void outArray(Student[] arr){
        for (Object s : arr){
            System.out.println(s);
        }
    }

    public static void main(String[] args){
        Student st = new Student("Георгий", "Чуфистов", "программист",
                2, "ИКБО-04-21");
        Scanner sc = new Scanner(System.in);
        //SortingStudentsByGPA ssbg = new SortingStudentsByGPA();
        Student[] students = setArray("qsort");

        System.out.print("Введите название поля, по которому будет проходить сортировка: ");
        String field = sc.nextLine();

        System.out.println("Массив до сортировки (qsort)");
        outArray(students);
        System.out.println("\nМассив после сортировки (qsort)");

        qSort(students, students.length - 1, 0, field);
        outArray(students);

        System.out.println();

        Student[] students2 = setArray("msort");
        System.out.println("Новый массив до сортировки");
        outArray(students2);

        Student[] allStudents = new Student[students.length + students2.length];
        System.arraycopy(students, 0, allStudents,0,students.length);
        System.arraycopy(students2, 0, allStudents,students.length, students2.length);

        System.out.println("\nОбъединенный массив до сортировки (msort)");
        outArray(allStudents);

        mergeSort(allStudents, allStudents.length, field);

        System.out.println("\nВывод отсортированного массива (msort)");
        outArray(allStudents);
    }
}
