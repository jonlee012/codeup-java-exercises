package shapes;

public class Square extends Quadrilateral{

    public Square(double side) {
        super(side, side);
    }

    public double getArea() {
        return this.length * this.width;
    }

    public double getPerimeter() {
        return 2 * (this.length + this.width);
    }

    public void setLength(double side) {
        this.length = side;
    }

    public void setWidth(double side) {
        this.width = side;
    }
//    public void setSide(int side){
//        this.side = side;
//        this
//    }
}