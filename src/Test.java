public class Test {
    public static void main(String[] args) {
        Square happySquare = new Square(9.876);
        Triangle luckyTriangle = new Triangle(6.13, 7.77, 13.6);
        Circle prettyCircle = new Circle(4.13);
        Rectangle smartRectangle = new Rectangle(6.9, 9.6);
        ShapeCalc shapeCalc = new ShapeCalc();

      // double sArea = shapeCalc.squareArea(happySquare);
       //double tPer = shapeCalc.trianglePerimeter(luckyTriangle);
       //double cArea = shapeCalc.circleArea(prettyCircle);
       //double rPer = shapeCalc.rectPerimeter(smartRectangle);

        double rectArea = smartRectangle.calculateArea();
        System.out.println(rectArea);
        double sqrArea = happySquare.calculateArea();
        System.out.println(sqrArea);
        double trnglPerimeter = luckyTriangle.calculateArea();
        System.out.println(trnglPerimeter);
        double crclArea = prettyCircle.calculateArea();
        System.out.println(crclArea);

       // System.out.println("Square area: "+sArea);
       // System.out.println("Circle area: "+cArea);
       // System.out.println("Rectangle perimeter: "+rPer);
        //System.out.println("Triangle perimeter: "+tPer);

    }
}
