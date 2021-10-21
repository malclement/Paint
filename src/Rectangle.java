import java.awt.*;

public class Rectangle {
    // px définit la largeur du rectangle
    protected int px;
    // py définit la hauteur du rectangle
    protected int py;
    private Color color;

    public Rectangle(int px, int py, Color color){
        this.color = color;
        this.px = px;
        this.py = py;
    }

    public void Draw(){}

    public void setBoundingBox(int hauteurBox, int largeurBox){
        this.px = largeurBox;
        this.py = hauteurBox;
    }

}
