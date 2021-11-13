package homework3;

public class Circle extends homework3.Shape {
    protected double radius;

    public Circle()
    {
        this.radius = 10;
        this.color = "Red";
        this.filled = true;
    }
    public Circle(double radius)
    {
        this.radius = radius;
        this.color = "Red";
        this.filled = true;
    }
    public Circle(double radius, String color, boolean filled)
    {
        this.radius = radius;
        this.color = color;
        this.filled = filled;
    }
    public double getRadius()
    {
        return radius;
    }
    public void setRadius(double radius)
    {
        this.radius = radius;
    }
    @Override

    public double getArea()
    {
        return radius * radius * 3.14;
    }
    @Override
    public double getPerimeter()
    {
        return radius * 2 * 3.14;
    }

    @Override

    public String toString()
    {
        return "Circle with radius = " + radius + ". It's " + color + " and filled " + filled;
    }
}