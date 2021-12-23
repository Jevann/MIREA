package homework10;

public class FunctionalChair implements homework10.Chair {
    public int sum(int a, int b)
    {
        return a+b;
    }
    public void sit()
    {
        System.out.println("Functional Chair");
    }
}