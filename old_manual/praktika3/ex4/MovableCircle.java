
public class MovableCircle implements Movable {
    private int radius;
    private MovablePoint center = new MovablePoint(0, 0, 0, 0);


    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {

        center.x = x;
        center.y = y;
        center.xSpeed = xSpeed;
        center.ySpeed = ySpeed;
        this.radius = radius;
    }

    public String toString(){
        return "MovableCircle, radius: " + radius + ", MovablePoint.java: center";
    }

    @Override
    public void moveUp() {
        center.moveUp();
    }

    @Override
    public void moveDown(){
        center.moveDown();
    }

    @Override
    public void moveLeft(){
        center.moveLeft();
    }

    @Override
    public void moveRight(){
        center.moveRight();
    }
}