import javax.swing.*;
import java.awt.*;

public class Drawing extends JPanel {
    private Color currentColor;
    private Figure currentFigure;

    public Drawing(){
        this.setBackground(Color.WHITE);
        this.currentColor = Color.BLACK;
        //this.currentFigure = ;
    }

    public Color getCurrentColor() {
        return currentColor;
    }

    public Figure getCurrentFigure() {
        return currentFigure;
    }
}
