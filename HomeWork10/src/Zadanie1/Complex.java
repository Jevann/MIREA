package homework10;

public class Complex
{
    public static void main(String[] args)
    {
        homework10.ConcreteFactory Number=new homework10.ConcreteFactory();
        Number.CreateComplex(2,5);
        System.out.println(Number.toString());
        Number.CreateComplex(5,1);
        System.out.println(Number.toString());
    }

}