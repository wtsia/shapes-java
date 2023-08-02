|AUTHORS|
|:-:|
| Winston Tsia, Noah Rodriguez, Nicole Mills-Dunning,  Garrick Ngai |

# Java Shapes Repository
This repository contains a collection of Java classes that represent various shapes in both two-dimensional and three-dimensional space. The classes provide functionalities to calculate area, volume, and other properties of these shapes.

# Usage
To use the classes in your Java application, follow these steps:

Clone the repository to your local machine:
```git clone https://github.com/your-username/java-shapes-repo.git```

Import the project into your Java IDE.

Explore the various shape classes and their methods to perform calculations and manipulate shape objects as needed.

Feel free to contribute, improve, or expand the repository with additional shape classes or more advanced functionalities.

Happy coding! :rocket:

## VSCode
`cd` into directory above `src` containing Java program

in directory:
```code .```

# Concepts
## Inheritance
In Java, inheritance is a fundamental object-oriented programming (OOP) concept that allows a class (called the subclass or derived class) to inherit properties and behaviors from another class (called the superclass or base class). The subclass extends the superclass, thereby acquiring all the non-private members (fields and methods) of the superclass.

Inheritance in Java is achieved using the extends keyword. When a class extends another class, it gains access to the fields and methods defined in the superclass. This relationship forms an "is-a" relationship, indicating that the subclass is a specialized version of the superclass.

## Polymorphism
In Java, polymorphism is a core object-oriented programming concept that allows a class to take on multiple forms. It enables a single method or operation to work with different types of objects, allowing objects of different classes to be treated as objects of a common superclass. Polymorphism is one of the pillars of OOP and is achieved through method overriding and method overloading.

# Classes
```
- Shape
  - ThreeDimensionalShape
    - Cube
    - Cylinder
  - TwoDimensionalShape
    - Circle
    - Rectangle
    - Square
- ShapeTester

```
- Circle: Represents a two-dimensional circle. It extends the TwoDimensionalShape class and provides methods to calculate its area and circumference.

- Cube: Represents a three-dimensional cube. It extends the ThreeDimensionalShape class and provides methods to calculate its volume and surface area.

- Cylinder: Represents a three-dimensional cylinder. It extends the ThreeDimensionalShape class and provides methods to calculate its volume and surface area.

- Rectangle: Represents a two-dimensional rectangle. It extends the TwoDimensionalShape class and provides methods to calculate its area and perimeter.

- Shape: An abstract class serving as the base class for all shape classes. It defines common properties and methods that are shared by both two-dimensional and three-dimensional shapes.

- ShapeTester: A class containing the main method that demonstrates the usage of the shape classes by creating instances of different shapes and performing calculations.

- Square: Represents a two-dimensional square. It extends the Rectangle class and provides methods to calculate its area and perimeter.

- ThreeDimensionalShape: An abstract class representing a three-dimensional shape. It extends the Shape class and defines methods related to three-dimensional shapes.

- TwoDimensionalShape: An abstract class representing a two-dimensional shape. It extends the Shape class and defines methods related to two-dimensional shapes.

# Methods
- Dimension Method: All shapes have dimensions that describe their size.
- Get Description: All shapes have a method that returns a text description that lists all properties of all names that describe the shape.
  - Example: A square description might be: Rectangle (a quadrilateral with four right angles) and Square (a quadrilateral with four equal sides and four equal angles)
- Area: All shapes have a method that calculates the area.
- Area 2-D: For two-dimensional shapes, the area is calculated.
- Surface Area: For three-dimensional shapes, the surface area is calculated.
- Perimeter: Two-dimensional shapes have a method that calculates the perimeter.
- Volume: Three-dimensional shapes have a method that calculates the volume.
- ToString: Returns text representation of shape name and size variables.
- Equals: Two shapes are considered the same with the same description and same size.
- hasSameFace, perimeterCanFitInside, canBeTopOrBottomOfCylinder
  
