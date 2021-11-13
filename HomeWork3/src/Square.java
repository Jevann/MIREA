package homework3;

public class Square extends homework3.Rectangle {
    public Square()
    {
        this.width = 7;
        this.length = 7;
        this.color = "Red";
        this.filled = true;
    }
    public Square(double side)
    {
        this.width = side;
        this.length = side;
        this.color = "Red";
        this.filled = true;
    }
    public Square(double side, String color, boolean filled)
    {
        this.width = side;
        this.length = side;
        this.color = color;
        this.filled = filled;
    }
    public double getSide()
    {
        return width;
    }
    public void setSide(double side)
    {
        this.width = side;
        this.length = side;
    }

    public void setWidth(double side)
    {
        this.width = side;
        this.length = side;
    }

    public void setLength(double side)
    {
        this.width = side;
        this.length = side;
    }

    @Override

    public String toString(){
        return "This is Square with side = " + width + ". It's " + color + " and filled " + filled;
    }
}