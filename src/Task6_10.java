import java.math.BigInteger;

public class Task6_10 {
    public static void main(String[] args) {
        BigInteger rez = BigInteger.ONE;

        for (int i = 1; i <= 200; i++) {
            BigInteger square = BigInteger.valueOf(i).pow(2);
            rez = rez.multiply(square);
        }

        System.out.println("Произведение квадратов первых 200 чисел: " + rez);
    }
}
