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
        double p;

        {
            p = (side1 + side2 + side3) / 2;
        }
        double trnglArea = Math.sqrt(p * (p - side3) * (p - side2) * (p - side1));
        return trnglArea;
    }
}
