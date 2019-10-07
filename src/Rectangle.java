public class Rectangle {

    double sideA;
    double sideB;
    Rectangle(double a, double b){
        sideA = a;
        sideB = b;
    }
    double calculateArea(){
        double rectArea = sideA*sideB;
        return rectArea;
    }
}
