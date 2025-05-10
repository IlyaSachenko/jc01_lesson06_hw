import java.util.Scanner;

public class Task614 {
    public static void main(String[] args) {

        Scanner sc;
        int Angle1;
        int Angle2;

        sc = new Scanner(System.in);

        System.out.print("Введите величину угла №1 треугольника >");
        Angle1 = sc.nextInt();

        System.out.print("Введите величину угла №2 треугольника >");
        Angle2 = sc.nextInt();

        if ((Angle1 + Angle2) < 180) {
            System.out.println("Такой треугольник возможен");
        } else {
            System.out.println("Такой треугольник невозможен");
        }

        if (Angle1 == 90 || Angle2 == 90) {
            System.out.println("Данный треугольник является прямоугольным");
        }
    }
}

