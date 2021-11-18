import java.awt.*;

/**
 * Ellipse Class extends Figure Class
 * Each object have 4 attributes :
 * A beginning point (x,y)
 * A color
 * Two int to represent axis size
 *
 * @author clement
 */

public class Ellipse extends Figure{

    // Variables
    protected int demiAxeX=0;
    protected int demiAxeY=0;

    // Getter and Setter
    // They will be rewritten in Circle Class
    public void setDemiAxeX(int demiAxeX) {this.demiAxeX = demiAxeX;}
    public void setDemiAxeY(int demiAxeY) {this.demiAxeY = demiAxeY;}

    // Constructor
    public Ellipse (int px, int py, Color color){
        super(new Point(px,py), color);
    }

    public void setBoundingBox(int hauteurBox, int largeurBox){
        this.demiAxeY = largeurBox;
        this.demiAxeX = hauteurBox;
    }

    @Override
    public void draw(Graphics graphics) {
        graphics.setColor(this.color);
        graphics.fillOval(this.origine.getmyX(),
                this.origine.getmyY(),
                this.demiAxeX,
                this.demiAxeY);
    }
}
