import java.awt.*;
import java.io.Serializable;

public abstract class Figure implements Serializable {

    protected Point origine;
    public Color color;


    public Figure(){
        this.origine = new Point();
    }

    public Figure(Point p){
        this.origine = p;
    }

    public Figure(Point p, Color c){
        this.origine = p;
        this.color = c;
    }

    @Override
    public String toString(){
        return "la couleur est : "+color+" et l'origine est : "+origine;
    }

    /** définit la hauteur et largeur de **/
    public abstract void setBoundingBox (int heightBB, int widthBB);
    public abstract void draw (Graphics g);


}
