package shapes;

public class Square extends Quadrilateral{
//    @Override
    public void setLength(int length) {
        this.length = length;
    }

//    @Override
    public void setWidth(int width) {
        this.width = width;
    }

//    @Override
    public double getPerimeter() {
        return (4 * width);
    }

//    @Override
    public double getArea() {
        return width * length;
    }
    Quadrilateral()
}

//public class Square extends Rectangle{
//    public Square(int side){
//        super(side, side);
//    }
//    public int getArea(){
//        return  this.length * this.length;
//    }
//
//    public int getPerimeter(){
//        return 4 * length;
//    }
//}