import java.util.Scanner;

public class Task616 {
    public static void main(String[] args) {

        Scanner sc;
        double x;
        double y;

        sc = new Scanner(System.in);

        System.out.print("Введите x -> ");
        x = sc.nextDouble();

        System.out.print("Введите y -> ");
        y = sc.nextDouble();

        if (x == 0 && y != 0) {
            System.out.print("Точка находится на оси OY");
        } else if (y == 0 && x != 0) {
            System.out.print("Точка находится на оси OX");
        } else if (x == 0 && y == 0) {
            System.out.print("Точка находится в начале координат");
        }

        if (x > 0 && y > 0) {
            System.out.print("Точка находится в 1 четверти");
        } else if (x < 0 && y > 0) {
            System.out.print("Точка находится во 2 четверти");
        } else if (x < 0 && y < 0) {
            System.out.print("Точка находится в 3 четверти");
        } else if (x>0 && y<0) {
            System.out.print("Точка находится в 4 четверти");
        }
    }
}
