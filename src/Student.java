import java.awt.*;

public class Student {

    private int x = 0;
    private int y = 0;
    private String name = "";
    private boolean present = true;

    public Student(int x, int y, String name, boolean present){
        this.x = x;
        this.y = y;
        this.name = name;
        this.present = present;
    }

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    public void setX(int n){
        x = n;
    }

    public void setY(int n){
        y = n;
    }

    public String getName(){
        return name;
    }

    public void setName(String n){
        name = n;
    }

    public void draw(Graphics g) {
        g.fillRect(x,y,100,50);
    }
}
