public class TestBall {
    public static void main(String[] args){
        Ball b = new Ball();
        b.setX(2.0); b.setY(4.0);
        b.move(4.5, 6.5);
        System.out.println(b.toString());
    }
}