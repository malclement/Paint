import java.awt.*;

public class Rectangle extends Figure{

    // Variables
    protected int px;// px the width of the Rectangle
    protected int py;// py the height of the Rectangle
    private Color color;

    // Getter and Setter
    public void setPx(int px) {this.px = px;}
    public void setPy(int py) {this.py = py;}

    // Constructor
    public Rectangle (int px, int py, Color color){
        super(new Point(px,py), color);
    }

    public void setBoundingBox(int hauteurBox, int largeurBox){
        this.px = largeurBox;
        this.py = hauteurBox;
    }

    @Override
    public void draw(Graphics graphics) {
        graphics.setColor(this.color);
        graphics.fillRect(this.origine.getmyX(),this.origine.getmyY(),this.py,this.px);
    }

}
