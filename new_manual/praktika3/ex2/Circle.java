import java.util.Comparator;

public class Circle implements Comparable<Circle> {
    private Point center;
    private int radius;

    Circle(int x, int y, int radius){
        center = new Point(x, y);
        this.radius = radius;
    }
    public int get_radius(){
        return radius;
    }

    @Override
    public int compareTo(Circle other){
        return this.get_radius() - other.get_radius();
    }

    @Override
    public String toString() {
        return "    Координаты:\n" + center + "    Радиус: " + get_radius();
    }
}