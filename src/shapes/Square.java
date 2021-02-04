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
    public int getPerimeter() {
        return (4 * width);
    }

//    @Override
    public int getArea() {
        return this.width * this.length;
    }

    Square(int length){
        super(length, length);
    }
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