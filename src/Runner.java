import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JPanel;

public class Runner extends JPanel implements ActionListener, KeyListener, MouseListener {
    private static final long serialVersionUID = 1L;

    // ==FIELDS==
    private final Font font = new Font("ComicSans", Font.PLAIN, 20);
    ArrayList<Student> students;

    public Runner() {
        students = new ArrayList<>();
    }

    //Paints everything
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.orange);
        g.fillRect((int) (getWidth() * 7.5 / 9), 0, (getWidth()), getHeight());
        g.setColor(Color.lightGray);
        g.setFont(font);
        for (int x = 0; x < students.size(); x++)
            students.get(x).draw(g);
        repaint();
    }


    @Override
    public void mouseClicked(MouseEvent arg0) {
        if (arg0.getButton() == MouseEvent.BUTTON3) {
            for (int x = 0; x < students.size(); x++) {
                if (students.get(x).isIntersecting(getMousePosition().x, getMousePosition().y)) {
                    students.get(x).togglePresent();
                    repaint();
                }
            }
        } else if (arg0.getButton() == MouseEvent.BUTTON2) {
            for (int x = 0; x < students.size(); x++) {
                if (students.get(x).isIntersecting(getMousePosition().x, getMousePosition().y)) {
                    System.out.print("Enter Student's Name: ");
                    Scanner sc = new Scanner(System.in);
                    String name = sc.nextLine();
                    students.get(x).setName(name);
                    System.out.println();
                }
            }
        } else {
            students.add(new Student(getMousePosition().x - 50, getMousePosition().y - 25, "Student", true));
            for (int x = 0; x < students.size(); x++) {
                for (int y = 0; y < students.size() && y != x; y++) {
                    if (students.get(x).circle(students.get(y).getX(), students.get(y).getY())) {
                        students.get(x).setName("too close!");
                        students.get(y).setName("too close!");
                    }

                }
            }
            repaint();
        }
    }

    @Override
    public void mouseEntered(MouseEvent arg0) {

    }


    @Override
    public void mouseExited(MouseEvent arg0) {

    }

    @Override
    public void mousePressed(MouseEvent arg0) {
        // TODO Auto-generated method stub
    }

    @Override
    public void mouseReleased(MouseEvent arg0) {
        // TODO Auto-generated method stub
    }

    @Override
    public void keyPressed(KeyEvent arg) {
        if (arg.getKeyCode() == KeyEvent.VK_BACK_SPACE)
            if (students.size() > 0)
                students.remove(students.size() - 1);
        repaint();
    }

    @Override
    public void keyReleased(KeyEvent arg) {
    }

    @Override
    public void keyTyped(KeyEvent arg) {
        // TODO Auto-generated method stub
    }

    @Override
    public void actionPerformed(ActionEvent arg0) {

    }

}