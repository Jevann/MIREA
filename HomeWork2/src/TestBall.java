package balls;
public class TestBall {
    public static void main(String[] args) {
        balls.Ball b1 = new balls.Ball(100, 100);
        System.out.println(b1);
        b1.move(30, 15);
        System.out.println(b1);
    }
}