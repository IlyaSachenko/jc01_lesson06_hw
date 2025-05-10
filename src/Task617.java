import java.util.Scanner;

public class Task617 {
    public static void main(String[] args) {

        Scanner sc;
        int m;
        int n;

        sc = new Scanner(System.in);

        System.out.print("Введите число m -> ");
        m = sc.nextInt();

        System.out.print("Введите число n -> ");
        n = sc.nextInt();

        if (m > n) {
            n = m;
            System.out.println("n = " + n);
            System.out.println("m = " + m);
        } else if (n > m) {
            m = n;
            System.out.println("n = " + n);
            System.out.println("m = " + m);
        } else if (m == n) {
            m = 0;
            n = 0;
            System.out.println("n = " + n);
            System.out.println("m = " + m);
        }
    }
}
