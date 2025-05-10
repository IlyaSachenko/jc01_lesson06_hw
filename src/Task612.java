import java.util.Scanner;

public class Task612 {
    public static void main(String[] args) {

        Scanner sc;
        int dig1, dig2, dig3;
        double temp;

        sc = new Scanner(System.in);

        System.out.print("Введите число №1 >");
        dig1 = sc.nextInt();

        System.out.print("Введите число №2 >");
        dig2 = sc.nextInt();

        System.out.print("Введите число №3 >");
        dig3 = sc.nextInt();

        if (dig1 > 0) {
            temp = Math.pow(dig1, 2);
            System.out.println("Квадрат числа №1 равен " + temp);
        } else {
            temp = Math.pow(dig1, 4);
            System.out.println("Четвёртая степень числа №1 равна " + temp);
        }

        if (dig2 > 0) {
            temp = Math.pow(dig2, 2);
            System.out.println("Квадрат числа №2 равен " + temp);
        } else {
            temp = Math.pow(dig2, 4);
            System.out.println("Четвёртая степень числа №2 равна " + temp);
        }

        if (dig3 > 0) {
            temp = Math.pow(dig3, 2);
            System.out.println("Квадрат числа №3 равен " + temp);
        } else {
            temp = Math.pow(dig3, 4);
            System.out.println("Четвёртая степень числа №3 равна " + temp);
        }
    }
}
