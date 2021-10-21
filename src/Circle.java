import java.awt.*;

public class Circle extends Ellipse{

    public Circle(int px, int py, Color color) {
        super(px, py, color);
    }

    public void setPetitAxe(int l){
        px=l;
        py=l;
    }
    public void setGrandAxe(int l){
        px=l;
        py=l;
    }

    @Override
    public void setBoundingBox(int setPetitAxe, int setGrandAxe){
        this.px=setGrandAxe;
        this.py=setGrandAxe;
    }
}
