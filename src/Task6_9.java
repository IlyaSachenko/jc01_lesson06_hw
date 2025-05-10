public class Task6_9 {
    public static void main(String[] args) {

        double rez = 0;
        int a = 1;
        int b = 100;

        for (int i = a; i <= b; i++) {
            rez = Math.pow(i, 2) + rez;
        }
        System.out.println("Rez = " + rez);
    }
}
