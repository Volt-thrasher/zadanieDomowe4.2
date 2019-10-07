public class Circle {

    double radius;
    Circle(double r){
        radius = r;
    }

    double calculateArea() {
        double crclArea = radius*radius*3.14;
        return crclArea;
    }

}
