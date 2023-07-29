//In terminal run "java ShapeTester2.java"

import java.util.*;
import java.util.ArrayList;
import java.util.List;

import org.w3c.dom.css.Rect;

public class ShapeTester2 {

    private static void printEqualShapes(Shape inputShapeA, Shape inputShapeB) {
        System.out.println("Equal shapes found:");
        System.out.println("\t" + inputShapeA);
        System.out.println("\t" + inputShapeB);
        System.out.println("");
    }

    public static void main(String[] args) {

        Rectangle rectangle1 = new Rectangle(3, 4);
        Rectangle rectangle2 = new Rectangle(4, 3);
        Rectangle rectangle3 = new Rectangle(5, 6);
        Square square1 = new Square(2);
        Square square2 = new Square(4);
        Square square3 = new Square(4);
        Circle circle1 = new Circle(3);
        Circle circle2 = new Circle(5);
        Cylinder cylinder1 = new Cylinder(new Circle(3), 5);
        Cylinder cylinder2 = new Cylinder(new Circle(4), 6);
        Cylinder cylinder3 = new Cylinder(new Circle(6), 4);
        Cube cube1 = new Cube(new Square(2));
        Cube cube2 = new Cube(new Square(3));

        List<Shape> shapeList = new ArrayList<>();
        shapeList.add(rectangle1);
        shapeList.add(rectangle2);
        shapeList.add(rectangle3);
        shapeList.add(square1);
        shapeList.add(square2);
        shapeList.add(square3);
        shapeList.add(circle1);
        shapeList.add(circle2);
        shapeList.add(cylinder1);
        shapeList.add(cylinder2);
        shapeList.add(cylinder3);
        shapeList.add(cube1);
        shapeList.add(cube2);

        System.out.println("*****PRINTING OUT THE TEXT REPRESENTATION, DESCRIPTION, AREA, AND PERIMETER/VOLUME OF EACH SHAPE");
        for (Shape shape : shapeList) {
            System.out.println(shape);
            System.out.println(shape.getDescription());
            System.out.println("\tArea: " + shape.getArea());

            if (shape instanceof TwoDimensionalShape) {
                TwoDimensionalShape twoDShape = (TwoDimensionalShape) shape;
                System.out.println("\tPerimeter: " + twoDShape.getPerimeter());
            }

            if (shape instanceof ThreeDimensionalShape) {
                ThreeDimensionalShape threeDShape = (ThreeDimensionalShape) shape;
                System.out.println("\tVolume: " + threeDShape.getVolume());
            }

            System.out.println("");
        }
        /**/
        System.out.println("\n*****PRINTING ALL EQUAL, NON-ALIAS SHAPES");

        for (int i = 0; i < shapeList.size(); i++) {
            for (int j = i + 1; j < shapeList.size(); j++) {
                Shape firstShape = shapeList.get(i);
                Shape secondShape = shapeList.get(j);
                if (firstShape.equals(secondShape)) {
                    printEqualShapes(firstShape, secondShape);
                    printEqualShapes(secondShape, firstShape);
                }
            }
        }
        /**/
        System.out.println("\n*****PRINTING ALL CUBE/SQUARE COMBINATIONS WHERE THE SQUARE IS A SIDE FOR THE CUBE");
        for (Shape firstShape : shapeList) {
            for (Shape secondShape : shapeList) {
                if (firstShape instanceof Cube && secondShape instanceof Square) {
                    Cube cube = (Cube) firstShape;
                    Square square = (Square) secondShape;
                    if (cube.getFace().equals(square)) {
                    	System.out.println("Square-Cube Match Found: ");
                        System.out.println("\t" + secondShape);
                        System.out.println("\t" + firstShape);
                        System.out.println("");
                    }
                }
            }
        }

        System.out.println("\n*****PRINTING ALL COMBINATIONS OF TWO-DIMENSIONAL SHAPES THAT CAN FIT INSIDE ANOTHER");
        /*
         *  algo design:
         *      - Compares all 2d shapes against other shapes + its own type
         *   
         * 
         */
        
        for (Shape firstShape : shapeList) {
            // check Rectangle
            if (firstShape instanceof TwoDimensionalShape && firstShape instanceof Rectangle) {
                Rectangle outerRectangle = (Rectangle) firstShape;
                for (Shape secondShape : shapeList) {
                    if (secondShape instanceof TwoDimensionalShape) {
                        TwoDimensionalShape innerShape = (TwoDimensionalShape) secondShape;
                        if (outerRectangle.perimeterCanFitInside(innerShape)) {
                            System.out.println("Nested Shapes Found:");
                            System.out.println("\tOuter: " + outerRectangle);
                            System.out.println("\tInner: " + innerShape);
                            System.out.println("");
                        }
                    }
                }
            }
        }

        for (Shape firstShape : shapeList) {
            // check Square
            if (firstShape instanceof TwoDimensionalShape && firstShape instanceof Square) {
                Square outerSquare = (Square) firstShape;
                for (Shape secondShape : shapeList) {
                    if (secondShape instanceof TwoDimensionalShape) {
                        TwoDimensionalShape innerShape = (TwoDimensionalShape) secondShape;
                        if (outerSquare.perimeterCanFitInside(innerShape)) {
                            System.out.println("Nested Shapes Found:");
                            System.out.println("\tOuter: " + outerSquare);
                            System.out.println("\tInner: " + innerShape);
                            System.out.println("");
                        }
                    }
                }
            }
        }

        for (Shape firstShape : shapeList) {
            // check Circle
            if (firstShape instanceof TwoDimensionalShape && firstShape instanceof Circle) {
                Circle outerCircle = (Circle) firstShape;
                for (Shape secondShape : shapeList) {
                    if (secondShape instanceof TwoDimensionalShape) {
                        TwoDimensionalShape innerShape = (TwoDimensionalShape) secondShape;
                        if (outerCircle.perimeterCanFitInside(innerShape)) {
                            System.out.println("Nested Shapes Found:");
                            System.out.println("\tOuter: " + outerCircle);
                            System.out.println("\tInner: " + innerShape);
                            System.out.println("");
                        }
                    }
                }
            }
        }
    }
}