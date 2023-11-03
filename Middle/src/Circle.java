class Circle extends Shape{
    private double radius;

    public Circle(int x, int y, double radius) {
        this(radius);
        translate(x, y);
    }

    @Override
    double getArea() {
        return PI*radius*radius;
    }

    @Override
    void scale(double s) {
        radius = radius * s;
    }

    public Circle(double r) {
        super("Circle",0,0);
        radius = r;
    }
}