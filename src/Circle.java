import java.awt.*;

public class Circle extends Ellipse{

    public Circle(int px, int py, Color color) {
        super(px, py, color);
    }

    public void setPetitAxe(int l){
        demiAxeX=l;
        demiAxeY=l;
    }
    public void setGrandAxe(int l){
        demiAxeX=l;
        demiAxeY=l;
    }

    @Override
    public void setBoundingBox(int setPetitAxe, int setGrandAxe){
        this.demiAxeX=setGrandAxe;
        this.demiAxeY=setGrandAxe;
    }
}
