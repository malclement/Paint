import java.awt.*;

/**
 * Square Class extends Rectangle Class
 * This class force the rectangle object to have
 * the same width and height
 *
 * @author clement
 */

public class Square extends Rectangle{

    // Constructor
    public Square(int px, int py, Color color) {
        super(px, py, color);
    }

    @Override
    public void setPy(int l){
        px=l;
        py=l;
    }
    @Override
    public void setPx(int l){
        px=l;
        py=l;
    }

    @Override
    public void setBoundingBox(int hauteurBox, int largeurBox){
        this.px=hauteurBox;
        this.py=hauteurBox;
    }


}
