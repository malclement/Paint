import java.awt.*;

public class Ellipse extends Figure{

    // Variables
    protected int demiAxeX=0;
    protected int demiAxeY=0;
    private Color color;

    // Getter and Setter
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
