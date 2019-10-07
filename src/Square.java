public class Square {

    double side;
    Square(double a){
      side = a;
    }

    double calculateArea() {
        double sqrArea = side * side;
        return sqrArea;
    }
}
