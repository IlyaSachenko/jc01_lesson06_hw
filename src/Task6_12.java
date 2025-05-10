public class Task6_12 {
    public static void main(String[] args) {

        int a = 1;
        int d = 6; //Разность прогрессии
        int rez = 1;

        for (int i = 0; i <= 10; i++) {
            rez = (6 * i - 5) * rez;
        }
        System.out.println("Произведение первых 10 членов последовательности равно " + rez);
    }
}
