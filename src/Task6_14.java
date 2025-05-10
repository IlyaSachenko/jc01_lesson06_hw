public class Task6_14 {
    public static void main(String[] args) {

        int n = 10;
        double rez = 0;

        for (double i = 1; i <= n; i++) {
            rez = rez + (1 / i);
        }
        System.out.println("rez = " + rez);
    }
}
