package shapes;

public class Rectangle {
    protected int width;
    protected int length;

    public Rectangle(int width, int length){
        this.width = width;
        this.length = length;
    }

//    public Rectangle(){
//        this.width = 5;
//        this.length = 5;
//    }

    public int getArea(){
        return length * width;
    }

    public int getPerimeter(){
        return (2 * length) + (2 * width);
    }
}
