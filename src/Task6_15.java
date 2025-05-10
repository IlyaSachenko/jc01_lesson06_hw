public class Task6_15 {
    public static void main(String[] args) {

        double rez = 1;

        for (int i = 1; i <= 10; i++) {
            rez += Math.pow(2, i);
        }
        System.out.println("Результат вычисления последовательности равен " + rez);
    }
}
