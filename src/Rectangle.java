import java.awt.*;

/**
 * Rectangle Class extends Figure Class
 * Each object have 4 attributes :
 * A beginning point (x,y)
 * A color
 * A Width and a Height
 */

public class Rectangle extends Figure{

    // Variables
    protected int px;// px the width of the Rectangle
    protected int py;// py the height of the Rectangle


    // Getter and Setter
    // They will be rewritten in Square Class
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
