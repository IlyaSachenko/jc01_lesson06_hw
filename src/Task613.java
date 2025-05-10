public class Task613 {
    public static void main(String[] args) {

        int x1 = 2, y1 = 2;
        int x2 = 3, y2 = 3;
        double l1, l2;

        l1 = Math.sqrt(Math.pow((x1 - 0), 2) + Math.pow((y1 - 0), 2));
        l2 = Math.sqrt(Math.pow((x2 - 0), 2) + Math.pow((y2 - 0), 2));

        if (l1 > l2) {
            System.out.println("Точка №1 находится дальше от начала координат чем точка №2");
        } else {
            System.out.println("Точка №2 находится дальше от начала координат чем точка №1");
        }
    }
}
