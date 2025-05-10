public class Task6_13 {
    public static void main(String[] args) {

        double y;

        System.out.println("--------------------");
        System.out.println("|   x    |    y    |");
        System.out.println("--------------------");

        for (double x = -5; x <= 5; x += 0.5) {
            y = 5 - (x * x) / 2;
            System.out.printf("| %5.1f | %8.3f |\n", x, y);
        }
        System.out.println("--------------------");
    }
}
