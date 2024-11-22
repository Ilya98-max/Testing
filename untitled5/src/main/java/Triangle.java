

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter a: ");
            double a = scanner.nextDouble();

            System.out.print("Enter b: ");
            double b = scanner.nextDouble();

            System.out.print("Enter c: ");
            double c = scanner.nextDouble();

            checkTriangle(a, b, c);
        } catch (Exception e) {
            System.out.println("Треугольник не существует");
        }
    }

    static void checkTriangle(double a, double b, double c) {

        if (a < 0 || b < 0 || c < 0 || a + b <= c || a + c <= b || b + c <= a) {
            System.out.println("Треугольник не существует");
            return;
        }

        String triangleType = getTriangleType(a, b, c);
        System.out.println(triangleType);
    }


    static String getTriangleType(double a, double b, double c) {
        if (a == b && b == c) {
            return "Равносторонний треугольник";
        }
        if (a == b || b == c || a == c) {
            return "Равнобедренный треугольник";
        }
        return "Разносторонний треугольник";
    }
}



