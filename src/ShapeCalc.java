public class ShapeCalc {

    double squareArea(Square square){
        double squareArea=square.side*square.side;
        return squareArea;
    }
    double circleArea(Circle cirle){
        double circleArea = 3.14*cirle.radius*cirle.radius;
        return circleArea;
    }
    double trianglePerimeter(Triangle triangle){
        double trianglePerimeter= triangle.side1+triangle.side2+triangle.side3;
        return trianglePerimeter;
    }
    double rectPerimeter(Rectangle rectangle){
        double rectPerimeter=2*(rectangle.sideB+rectangle.sideA);
        return rectPerimeter;
    }
}
