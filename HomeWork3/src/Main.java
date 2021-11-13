package homework3;

public class Main {

    public static void main(String[] args) {
        homework3.Shape s1 = new homework3.Circle(5.5, "RED", false); // Upcast Circle to Shape
        System.out.println(s1); // which version?
        System.out.println(s1.getArea()); // which version?
        System.out.println(s1.getPerimeter()); // which version?
        System.out.println(s1.getColor());
        System.out.println(s1.isFilled());


        homework3.Circle c1 = (homework3.Circle) s1; // Downcast back to Circle
        System.out.println(c1);
        System.out.println(c1.getArea());
        System.out.println(c1.getPerimeter());
        System.out.println(c1.getColor());
        System.out.println(c1.isFilled());
        System.out.println(c1.getRadius());

        homework3.Shape s3 = new homework3.Rectangle(1.0, 2.0, "RED", false); // Upcast
        System.out.println(s3);
        System.out.println(s3.getArea());
        System.out.println(s3.getPerimeter());
        System.out.println(s3.getColor());


        homework3.Rectangle r1 = (homework3.Rectangle) s3; // downcast
        System.out.println(r1);
        System.out.println(r1.getArea());
        System.out.println(r1.getColor());
        System.out.println(r1.getLength());

        homework3.Shape s4 = new homework3.Square(6.6); // Upcast
        System.out.println(s4);
        System.out.println(s4.getArea());
        System.out.println(s4.getColor());

// Take note that we downcast Shape s4 to Rectangle,
// which is a superclass of Square, instead of Square
        homework3.Rectangle r2 = (homework3.Rectangle) s4;
        System.out.println(r2);
        System.out.println(r2.getArea());
        System.out.println(r2.getColor());
        System.out.println(r2.getLength());

// Downcast Rectangle r2 to Square
        homework3.Square sq1 = (homework3.Square) r2;
        System.out.println(sq1);
        System.out.println(sq1.getArea());
        System.out.println(sq1.getColor());
        System.out.println(sq1.getSide());
        System.out.println(sq1.getLength());

        System.out.println(" ");
        homework3.MovablePoint mp = new homework3.MovablePoint(5, 5, 2, 2);
        System.out.println(mp.toString());
        mp.moveDown();
        mp.moveLeft();
        System.out.println(mp.toString());


        System.out.println(" ");
        homework3.MovableCircle mc = new homework3.MovableCircle(5, 5, 2, 2, 10);
        System.out.println(mc.toString());
        mc.moveDown();
        mc.moveLeft();
        System.out.println(mc.toString());

        System.out.println(" ");
        homework3.MovableRectangle mr = new homework3.MovableRectangle(-10, 10, 12, -12, 10, 10);
        System.out.println(mr.toString());
        mr.moveDown();
        mr.moveLeft();
        System.out.println(mr.toString());
    }
}