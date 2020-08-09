import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Runner extends JPanel implements ActionListener, KeyListener, MouseListener {
    private static final long serialVersionUID = 1L;

    // ==FIELDS==
    private final Font font = new Font("ComicSans", Font.PLAIN, 20);
    ArrayList<Student> students;

    public Runner() {
        students = new ArrayList<Student>();
    }

    //Paints everything
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.orange);
        g.fillRect((int) (getWidth() * 7.5 / 9), 0, (getWidth()), getHeight());
        g.setColor(Color.lightGray);
        g.setFont(font);
        for(int x=  0; x < students.size(); x++)
            students.get(x).draw(g);
    }

    @Override
    public void mouseClicked(MouseEvent arg0) {
        students.add(new Student(getMousePosition().x - 50, getMousePosition().y  - 25, "Student", true));
    }

    @Override
    public void mouseEntered(MouseEvent arg0) {
        // TODO Auto-generated method stub
    }

    @Override
    public void mouseExited(MouseEvent arg0) {
        // TODO Auto-generated method stub
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