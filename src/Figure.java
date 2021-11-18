import java.awt.*;
import java.io.Serializable;

public abstract class Figure implements Serializable {

    // Variables
    protected Point origine;
    public Color color;

    // Constructor
    public Figure(Point p, Color c){
        this.origine = p;
        this.color = c;
    }

    @Override
    public String toString(){
        return "la couleur est : "+color+" et l'origine est : "+origine;
    }

    // Set Height and Width
    public abstract void setBoundingBox (int heightBB, int widthBB);
    public abstract void draw (Graphics g);


}
