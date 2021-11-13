import java.awt.*;

public class Rectangle extends Figure{
    // px définit la largeur du rectangle
    protected int px;
    // py définit la hauteur du rectangle
    protected int py;
    private Color color;

    public Rectangle (int px, int py, Color color){
        super(new Point(px,py), color);
    }


    public void Draw(){}

    public void setBoundingBox(int hauteurBox, int largeurBox){
        this.px = largeurBox;
        this.py = hauteurBox;
    }

    @Override
    public void draw(Graphics g) {

    }

}
