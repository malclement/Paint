import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Drawing extends JPanel implements MouseMotionListener, MouseListener {

    public Color currentColor;
    public String currentFigure;
    public ArrayList<Figure> list = new ArrayList<>();
    public int x;
    public int y;

    // Constructor
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

    // Getter and Setter
    public void setCurrentColor(Color currentColor) {this.currentColor = currentColor;}
    public void setCurrentFigure(String currentFigure) {this.currentFigure = currentFigure;}

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {
        /* Check if mousePressed is detected :
         * System.out.println("mousePressed");
         */
        x = e.getX();
        y = e.getY();
        switch (this.currentFigure){
            case "Ellipse" :
                list.add(new Ellipse(x, y, this.currentColor));
                break;
            case "Cercle" :
                list.add(new Circle(x, y, this.currentColor));
                break;
            case "Rectangle" :
                list.add(new Rectangle(x, y, this.currentColor));
                break;
            case "Carre" :
                list.add(new Square(x, y,this.currentColor));
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
        /* Check if mouseDragged is detected :
         * System.out.println("mouseDragged");
         */
        int X = e.getX()-this.x;
        int Y = e.getY()-this.y;
        list.get(list.size()-1).setBoundingBox(X,Y);
        repaint();
    }

    @Override
    public void mouseMoved(MouseEvent e) {

    }

    protected void paintComponent(Graphics graphics){
        super.paintComponent(graphics);
        this.setBackground(Color.WHITE);
        for (Figure figure: list){figure.draw(graphics);}

    }

    public void save(){
        try{
            FileOutputStream fos = new FileOutputStream("saveDrawing");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeInt(list.size());
            for(Figure f : list){
                oos.writeObject(f);
            }
            oos.close();
        }
        catch (Exception e){
            System.out.println("Erreur Sauvegarde");
        }
    }

    public void open(){
        try {
            FileInputStream fis = new FileInputStream("saveDrawing");
            ObjectInputStream ois = new ObjectInputStream(fis);
            for(int i = 0; i < ois.readInt(); ++i) {
                list.add((Figure)ois.readObject());
            }
            ois.close();
            repaint();
        } catch (Exception e) {
            System.out.println("Erreur Chargement");
        }
    }

    public void nouveau(){
        this.list = new ArrayList<>();
        this.repaint();
    }
}
