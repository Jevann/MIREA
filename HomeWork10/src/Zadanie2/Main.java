package homework10;

public class Main {
    public static void main(String[] args)
    {
        homework10.ChairFactory chairFactory1 = new homework10.ChairFactory();
        homework10.MagicChair chair = chairFactory1.createMagicianChair();
        chair.doMagic();
        homework10.FunctionalChair chair1 = chairFactory1.createFunctionalChair();
        System.out.println(chair1.sum(5,1));
        homework10.VictorianChair chair2 = chairFactory1.createVictorianChair();
        System.out.println(chair2.getAge());
        chair.sit();
        chair1.sit();
        chair2.sit();
    }
}