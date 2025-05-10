import java.util.Scanner;

public class Task611 {
    public static void main(String[] args) {

        Scanner sc;
        int s1;
        int s2;

        sc = new Scanner(System.in);

        System.out.print("Введите площадь первого треугольника s1 >");
        s1 = sc.nextInt();

        System.out.print("Введите площадь второго треугольника s2 >");
        s2 = sc.nextInt();

        if (s1 > s2) {
            System.out.println("Площадь треугольника №1 больше площади треугольника №2");
        } else if (s2 > s1) {
            System.out.println("Площадь треугольника №2 больше площади треугольника №1");
        } else {
            System.out.println("Площади равны");
        }
    }
}