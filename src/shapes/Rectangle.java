package shapes;

public class Rectangle extends Quadrilateral implements Measurable{
//    @Override
    public void setWidth(int width) {
        this.width = width;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getPerimeter() {
        return (4 * width);
    }

    public int getArea() {
        return this.width * this.length;
    }

    Rectangle(int length, int width){
        super(2, 4);
    }
}

//public class Rectangle {
//    protected int width;
//    protected int length;
//
//    public Rectangle(int width, int length){
//        this.width = width;
//        this.length = length;
//    }
//
//    public int getArea(){
//        return length * width;
//    }
//
//    public int getPerimeter(){
//        return (2 * length) + (2 * width);
//    }
//}
