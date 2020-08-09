import java.awt.*;

public class Student {

    private int x = 0;
    private int y = 0;
    private String name = "";
    private boolean present = true;

    public Student(int x, int y, String name, boolean present) {
        this.x = x;
        this.y = y;
        this.name = name;
        this.present = present;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int n) {
        x = n;
    }

    public void setY(int n) {
        y = n;
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }

    public void togglePresent() {
        present = !present;
    }

    public boolean isIntersecting(int xPos, int yPos) {
        if ((xPos >= getX()) && (xPos < x + 100) && (yPos >= getY()) && (yPos < y + 100))
            return true;
        return false;
    }

    public boolean circle(int xPos, int yPos) {
       return (xPos > x-250 && xPos < x+150 && yPos > y-250 && yPos < y+150);
    }

    public void draw(Graphics g) {
        g.setColor(Color.lightGray);
        g.fillRect(x, y, 100, 50);
        g.drawRect(x-50,y-50,200,200);
        if (present)
            g.setColor(Color.green);
        else
            g.setColor(Color.red);
        g.drawString(name, x, y + 50);
    }
}
