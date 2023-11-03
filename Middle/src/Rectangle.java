class Rectangle extends Shape{
    private double width, height;
    public Rectangle(double width, double height) {
        super("Rectangle",0,0);
        this.width = width;
        this.height = height;
    }

    public Rectangle(int x, int y, double width, double height) {
        this(width, height);
        this.x = x;
        this.y = y;
    }

    @Override
    double getArea() {
        return width * height;
    }

    @Override
    void scale(double s) {
        width = width * s;
        height = height * s;
    }
}