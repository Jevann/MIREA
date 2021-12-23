package homework10;

public class ChairFactory implements homework10.AbctractChairFactory {
    public homework10.VictorianChair createVictorianChair()
    {
        return new homework10.VictorianChair(0);
    }
    public homework10.MagicChair createMagicianChair()
    {
        return new homework10.MagicChair();
    }
    public homework10.FunctionalChair createFunctionalChair()
    {
        return new homework10.FunctionalChair();
    }
}