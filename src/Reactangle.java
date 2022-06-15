public class Reactangle {
    private int l;
    private int b;

    private long area;
    private long perimeter;


    public long getArea() {
        return this.area;
    }

    public long getPerimeter() {
        return this.perimeter;
    }

    public void setArea(int l,int b) {

        this.area = l * b;
    }

    public void setPerimeter(int l, int b) {

        this.perimeter = 2 * (l + b);
        ;
    }

    public void setL(int l) {
        this.l = l;
    }

    public void setB(int b) {
        this.b = b;
    }
}