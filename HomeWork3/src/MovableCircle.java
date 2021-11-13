package homework3;

public class MovableCircle implements homework3.Movable {
    private int radius;
    private homework3.MovablePoint center;

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius)
    {
        center = new homework3.MovablePoint(x, y, xSpeed, ySpeed);
        this.radius = radius;
    }
    public String toString()
    {
        return "x = " + center.x + ", y = " + center.y + ", xSpeed = " + center.xSpeed + ", ySpeed = " + center.ySpeed;
    }
    @Override
    public void moveUp()
    {
        center.y += center.ySpeed;
    }
    @Override
    public void moveDown()
    {
        center.y -= center.ySpeed;
    }
    @Override
    public void moveLeft()
    {
        center.x -= center.xSpeed;
    }
    @Override
    public void moveRight()
    {
        center.x += center.xSpeed;
    }
}