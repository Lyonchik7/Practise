package org.example;

// Импортируем все классы из пакета figures
// import figures.*; - импортирует Circle, Rectangle, Triangle, Figure
import figures.*;

public class Main {
    public static void main(String[] args) {
        try {
            // Создаем фигуры
            Rectangle rectangle = new Rectangle(5, 3);
            Circle circle = new Circle(4);
            Triangle triangle = new Triangle(3, 4, 5);

            // Площади и периметр
            System.out.println("Rectangle area: " + rectangle.calculateArea());  // + для склеивания строк
            System.out.println("Rectangle perimeter: " + rectangle.calculatePerimeter());

            System.out.println("Circle area: " + circle.calculateArea());
            System.out.println("Circle perimeter: " + circle.calculatePerimeter());

            System.out.println("Triangle area: " + triangle.calculateArea());
            System.out.println("Triangle perimeter: " + triangle.calculatePerimeter());
            

        } catch (RuntimeException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
