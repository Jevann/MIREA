package homework10;

public class VictorianChair implements homework10.Chair {
    private int age;
    public int getAge(){return this.age;}
    public VictorianChair(int age)
    {
        this.age=age;
    }
    public void sit()
    {
        System.out.println("Victorian Chair");
    }
}