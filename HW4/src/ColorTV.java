/*과제 #4-1 이승주 / 60191676 */
public class ColorTV extends TV{
    private int color;
    public ColorTV(int size,int color) {
        super(size);
        this.color = color;
    }
    protected int getColor(){
        return color;
    }
    public void printProperty(){
        System.out.println(getSize()+"인치 "+ getColor()+"컬러");
    }

}
