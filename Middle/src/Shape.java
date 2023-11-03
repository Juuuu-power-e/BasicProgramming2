abstract class Shape{
    String type;
    int x, y;
    static final double PI = 3.14;

    public Shape(String type, int x, int y){
        this.x = x;
        this.y = y;
        this.type = type;
    }
    public Shape(String type){
        this(type,0,0);
    }
    abstract double getArea();
    abstract  void scale(double s);
    void translate(int dx, int dy){
        this.x += dx;
        this.y = dy;
    }
}

