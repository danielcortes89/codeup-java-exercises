package shapes;

public class Circle {
    private double radius;

    Circle(){
        radius = 5;
    }
    Circle(double rad){
        radius = rad;
    }

    double getArea(){
        return (this.radius * this.radius) * Math.PI;
    }

    double getCircumference(){
        return 2 * radius * Math.PI;
    }
}
