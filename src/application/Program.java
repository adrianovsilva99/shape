package application;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;
import entities.enums.Color;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Shape> shapeList = new ArrayList<>();

        System.out.print("Enter the number of shapes: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Shape #" + (i + 1) + " data:");
            System.out.print("Rectangle or Circle (r/c)? ");
            char rectOrCircle = sc.next().charAt(0);
            sc.nextLine();
            System.out.print("Color (BLACK/BLUE/RED): ");
            String color = sc.nextLine();

            if (rectOrCircle == 'r'){
                System.out.print("Width: ");
                double width = sc.nextDouble();
                System.out.print("Height: ");
                double height = sc.nextDouble();
                shapeList.add(new Rectangle(Color.valueOf(color), width, height));
            } else if (rectOrCircle == 'c') {
                System.out.print("Radius: ");
                double radius = sc.nextDouble();
                shapeList.add(new Circle(Color.valueOf(color), radius));
            }
        }

        System.out.println("SHAPE AREAS:");
        for (Shape s : shapeList) {
            System.out.printf("%.2f%n", s.area());
        }

        sc.close();
    }
}
