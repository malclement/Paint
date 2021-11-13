import java.awt.*;

public class Ellipse extends Figure{
    protected int demiAxeX=0;
    protected int demiAxeY=0;
    private Color color;

    public Ellipse (int px, int py, Color color){
        super(new Point(px,py), color);
    }

    public void Draw(){}

    public void setBoundingBox(int hauteurBox, int largeurBox){
        this.demiAxeX = largeurBox;
        this.demiAxeY = hauteurBox;
    }

    @Override
    public void draw(Graphics g) {

    }
}
