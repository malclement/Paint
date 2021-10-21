import java.awt.*;

public class Ellipse {
    protected int px;
    protected int py;
    private Color color;

    public Ellipse (int px, int py, Color color){
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
