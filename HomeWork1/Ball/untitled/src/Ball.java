import java.lang.*;

public class Ball {
    private String color;
    private int volume;

    public Ball(String n, int a){
        color = n;
        volume = a;
}
    public Ball(String n){
        color = n;
        volume = 0;
    }
    public Ball(){
        color = "nocolor";
        volume = 0;
    }
    public void setColor(String color){
        this.color = color;
    }

    public void setVolume(int volume){
        this.volume = volume;
    }

    public String getColor(){
        return color;
    }
    public int getVolume(){
        return volume;
    }

    public String toString(){
        return "The color of the ball is "+this.color+" and the volume is "+this.volume;
    }
}

