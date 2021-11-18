import java.io.Serializable;

public class Point implements Serializable {

    // Private Variables
    private int myX;
    private int myY;

    // Getter and Setter
    public int getmyX() {
        return myX;
    }
    public int getmyY() {
        return myY;
    }

    // Constructor
    public Point() {
        int myX = 0;
        int myY = 0;
    }
    public Point(int x, int y) {
        myX = x;
        myY = y;
    }

    @Override
    public String toString(){
        return ("("+getmyX()+","+getmyY()+")");
    }

}
