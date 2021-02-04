package shapes;

abstract class Quadrilateral extends Shape implements Measurable{
    protected int length;
    protected int width;

    Quadrilateral(int length, int width){
        this.length = length;
        this.width = width;
    }

    int getWidth(){
        return this.width;
    }

    int getlength(){
        return this.length;
    }

    public abstract void setWidth(int width);
    public abstract void setLength(int length);
}
