public class Task6_8 {
    public static void main(String[] args) {

        int a = 10;
        int b = 20;
        int x;
        int y;
        int h = 2;
        int c = 3;

        x = a;

        while (x <= b) {
            if (x == 15) {
                y = (x + c) * 2;
            } else {
                y = (x - c) + 6;
                ;
            }
            System.out.println("x = " + x + ", y = " + y);
            x += h;
        }
    }
}
