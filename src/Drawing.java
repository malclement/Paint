import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

public class Drawing extends JPanel implements MouseMotionListener, MouseListener {


    public Color currentColor;
    public String currentFigure;
    public ArrayList<Figure> list = new ArrayList<>();
    public int x;
    public int y;
    private Point firstMouseEvent;
    private Point secondMouseEvent;


    public Drawing(){
        super();
        this.setBackground(Color.WHITE);
        this.currentColor = Color.BLACK;
        this.currentFigure = "Rectangle";
        this.list.add(new Rectangle(0, 0, Color.BLACK));
        this.x=0;
        this.y=0;
        this.addMouseListener(this);
        this.addMouseMotionListener(this);
    }

    public Color getCurrentColor() {
        return currentColor;
    }
    public void setCurrentColor(Color currentColor) {
        this.currentColor = currentColor;
    }
    public void setCurrentFigure(String currentFigure) {
        this.currentFigure = currentFigure;
    }


    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {
        x = e.getX();
        y = e.getY();
        switch (currentFigure){
            case "Ellipse" :
                list.add(new Ellipse(x, y, currentColor));
                break;
        }
    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    public void mouseDragged(MouseEvent e) {

    }

    @Override
    public void mouseMoved(MouseEvent e) {

    }
}
