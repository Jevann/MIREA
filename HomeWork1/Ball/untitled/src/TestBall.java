import java.lang.*;

public class TestBall {
    public static void main(String[] args) {
        Ball d1=new Ball("Green", 2);
        Ball d2=new Ball("Red",7);
        Ball d3=new Ball("Blue");
        d3.setVolume(1);
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
    }
}
