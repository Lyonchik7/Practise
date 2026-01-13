package figures;

public class Circle extends Figure {
    private double radius;

    public Circle(double radius) {
        if (radius <= 0) {
            throw new RuntimeException("There is no figure with such parameters.");
        }
        this.radius = radius;
    }

// @Override - аннотация, указывающая, что метод переопределяет метод родителя
// Компилятор проверяет, существует ли такой метод в родительском классе
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    public double getRadius() { return radius; }
}

