import java.awt.*;

public class Circle extends Ellipse{

    // Constructeur
    public Circle(int px, int py, Color color) {
        super(px, py, color);
    }
    @Override
    public void setDemiAxeX(int l){
        demiAxeX=l;
        demiAxeY=l;
    }
    @Override
    public void setDemiAxeY(int l){
        demiAxeX=l;
        demiAxeY=l;
    }

    @Override
    public void setBoundingBox(int setPetitAxe, int setGrandAxe){
        this.demiAxeX=setGrandAxe;
        this.demiAxeY=setGrandAxe;
    }
}
