package BouncingBalls;

public class TestBall {
    public static void main(String[] args) {
        Ball ball = new Ball(2.5f,1.5f,7,5,60);

        System.out.println("Get X: "+ball.getX());
        System.out.println("To String: "+ball+"\n");

        System.out.println("X Delta: "+ball.getXDelta()+"\n");

        ball.setX(5.5f);
        System.out.println("Get X: "+ball.getX());
        System.out.println("To String: "+ball+"\n");

        System.out.println("Get Y: "+ball.getY());
        System.out.println("To String: "+ball+"\n");

        System.out.println("X Delta: "+ball.getXDelta()+"\n");

        ball.setY(5.5f);
        System.out.println("Get Y: "+ball.getY());
        System.out.println("To String: "+ball+"\n");


        System.out.println("Radius: "+ball.getRadius());
        ball.setRadius(17);
        System.out.println(("Radius: ")+ball.getRadius()+"\n");


        ball.setXDelta(7.5f);
        System.out.println("X Delta: "+ball.getXDelta()+"\n");

        System.out.println("Y Delta: "+ball.getYDelta());
        ball.setYDelta(7.5f);
        System.out.println("Y Delta: "+ball.getYDelta()+"\n");

        ball.move();
        System.out.println("To String: "+ball+"\n");

        ball.reflectHorizontal();
        ball.reflectVertical();
        System.out.println("To String: "+ball+"\n");
    }
}
