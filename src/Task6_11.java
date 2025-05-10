import java.math.BigInteger;

public class Task6_11 {
    public static void main(String[] args) {
        BigInteger rez = BigInteger.ONE;

        for (int i = 1; i <= 200; i++) {
            BigInteger square = BigInteger.valueOf(i).pow(3);
            rez = rez.subtract(square);
        }

        System.out.println("Разность кубов первых 200 чисел: " + rez);
    }
}

