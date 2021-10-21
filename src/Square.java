import java.awt.*;

public class Square extends Rectangle{

    public Square(int px, int py, Color color) {
        super(px, py, color);
    }

    public void setLargeur(int l){
        px=l;
        py=l;
    }
    public void setLongueur(int l){
        px=l;
        py=l;
    }

    @Override
    public void setBoundingBox(int hauteurBox, int largeurBox){
        this.px=hauteurBox;
        this.py=largeurBox;
    }

}
