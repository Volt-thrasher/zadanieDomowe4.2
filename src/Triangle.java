public class Triangle {

    double side1;
    double side2;
    double side3;
    Triangle(double a, double b, double c){
        side1=a;
        side2=b;
        side3=c;
    }


    double calculateArea() {

        double trnglPerimeter = side1 + side2 + side3;
        return trnglPerimeter;
    }
}
