public class Rectangle extends java.awt.Rectangle {
    public Rectangle(int x, int y, int w, int h){
        super(x,y,w,h);
    }

    public void show() {
        System.out.println("("+x+","+y+")에서 크기가 "+width+"x"+height+"인 사각형");
    }
    public int square(){
        return width*height;
    }

    @Override
    public boolean contains(java.awt.Rectangle r) {
        return contains(r.x,r.y,r.width,r.height);
    }
    public boolean contains(int X, int Y, int W, int H) {
        int w = this.width;
        int h = this.height;
        if ((w | h | W | H) < 0) {
            // At least one of the dimensions is negative...
            return false;
        }
        // Note: if any dimension is zero, tests below must return false...
        int x = this.x;
        int y = this.y;
        if (X < x || Y < y) {
            return false;
        }
        w += x;
        W += X;
        if (W <= X) {
            // X+W overflowed or W was zero, return false if...
            // either original w or W was zero or
            // x+w did not overflow or
            // the overflowed x+w is smaller than the overflowed X+W
            if (w >= x || W >= w) return false;
        } else {
            // X+W did not overflow and W was not zero, return false if...
            // original w was zero or
            // x+w did not overflow and x+w is smaller than X+W
            if (w >= x && W >= w) return false;
        }
        h += y;
        H += Y;
        if (H <= Y) {
            if (h >= y || H >= h) return false;
        } else {
            if (h >= y && H >= h) return false;
        }
        return true;
    }
}
