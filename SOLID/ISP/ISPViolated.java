package SOLID.ISP;

public class ISPViolated {
    public static void main(String[] args) {

        Shapes circle = new Circle();
        circle.calculateArea();

        Shapes rectangle = new Rectangle();
        rectangle.calculateArea();

        Shapes cube = new Cube();
        cube.calculateArea();
        cube.calculateVolume();
    }
}

interface Shapes {
    double calculateArea();
    double calculateVolume();
}

class Circle implements Shapes {

    @Override
    public double calculateArea() {
        System.out.println("Circle area is calculated");
        return 5.1;
    }

    @Override
    public double calculateVolume() {
        throw new UnsupportedOperationException(
                "Circle is a 2D shape and has no volume");
    }
}

class Rectangle implements Shapes {

    @Override
    public double calculateArea() {
        System.out.println("Rectangle area is calculated");
        return 10.5;
    }

    @Override
    public double calculateVolume() {
        throw new UnsupportedOperationException(
                "Rectangle is a 2D shape and has no volume");
    }
}

class Cube implements Shapes {

    @Override
    public double calculateArea() {
        System.out.println("Cube surface area is calculated");
        return 54.0;
    }

    @Override
    public double calculateVolume() {
        System.out.println("Cube volume is calculated");
        return 27.0;
    }
}