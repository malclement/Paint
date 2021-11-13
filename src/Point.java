import java.io.Serializable;

public class Point implements Serializable {

    private int myX;
    private int myY;

    public int getmyX() {
        return myX;
    }

    public int getmyY() {
        return myY;
    }

    public void setmyX(int x) {
        myX = x;
    }

    public void setmyY(int y) {
        myY = y;
    }

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
