import java.util.Comparator;

public class SortingStudentsByGPA implements Comparator {
    //для сортировки quick_sort
    @Override
    public int compare(Object o1, Object o2) {
        if(!(o1 instanceof Student && o2 instanceof Student))
            throw new IllegalArgumentException("Объекты не являются студентами!");
        return ((Student) o1).getGPA() - ((Student) o2).getGPA();
    }
}