public class Task6_7 {
    public static void main(String[] args) {

        double a = 1;
        double b = 3;
        double x;
        double y;
        double h = 0.5;

        x = a;

        while (x <= b) {
            if (x > 2) {
                y = x;
            } else {
                y = -x;
            }
            System.out.println("x = " + x + ", y = " + y);
            x += h;
        }
    }
}
