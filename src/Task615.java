import java.util.Scanner;

public class Task615 {
    public static void main(String[] args) {

        Scanner sc;
        double x = 0, tempX;
        double y = 0, tempY;
        boolean inputFlag = false;

        sc = new Scanner(System.in);

        while (!inputFlag) {
            System.out.print("Введите число x -> ");
            x = sc.nextDouble();

            System.out.print("Введите число y -> ");
            y = sc.nextDouble();

            if(x == y){
                System.out.println("ОШИБКА! Введите разные числа");
            }else{
                inputFlag = true;
            }
        }

        tempX = x;
        tempY = y;

        if (x < y) {
            x = (x + y) / 2;
            y = (tempX * y) * 2;
            System.out.println("Меньшее число х заменено полусуммой - " + x);
            System.out.println("Большее число y заменено удвоенным произведением - " + y);
        } else {
            y = (x + y) / 2;
            x = (x * tempY) * 2;
            System.out.println("Меньшее число y заменено полусуммой - " + y);
            System.out.println("Большее число x заменено удвоенным произведением - " + x);
        }
    }
}
