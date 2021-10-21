public class Point {
    private int x;
    private int y;

    public Point(){
        this.x = 0;
        this.y = 0;
    }

    public Point(int a, int b){
        this.x = a;
        this.y = b;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }



    @Override
    public String toString(){
        return ("("+this.x+","+this.y+")");
    }





}
