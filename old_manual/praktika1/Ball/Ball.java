import java.lang.*;
class Ball {
    private double weight;
    private int number;
    private int radius;
    public Ball(){
        weight = 2.5;
        radius = 2;
        number = 1337;
    }
    public Ball(int number, double weight, int radius){
        this.weight = weight;
        this.number = number;
        this.radius = radius;
    }
    public Ball(int r){
        radius = r;
        weight = 2.5;
        number = 1337;
    }
    public void SetRadius(int radius){
        this.radius = radius;
    }
    public void SetWeight(double weight){
        this.weight = weight;
    }
    public int GetRadius(){
        return radius;
    }
    public double GetWeight(){
        return weight;
    }
    public String toString(){
        return "Ball with weight that equals to " +
                this.weight + "kgs, and radius that equals to " + this.radius + "cms";
    }
    public void Tester(){
        System.out.println("Ball number " + number + " with weight " + weight + " kgs and radius " + radius + " cms");
    }
}
