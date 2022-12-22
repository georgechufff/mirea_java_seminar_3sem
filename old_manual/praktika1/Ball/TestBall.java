import java.lang.*;
public class TestBall {
    public static void main(String[] args){
        Ball b1 = new Ball(1, 2.5, 4);
        Ball b2 = new Ball(2,3.5, 6);
        Ball b3 = new Ball(3, 1.4, 5);
        b3.SetWeight(6.9);
        b1.Tester();
        b2.Tester();
        b3.Tester();
    }
}
