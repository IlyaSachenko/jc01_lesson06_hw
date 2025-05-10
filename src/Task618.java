public class Task618 {
    public static void main(String[] args){
        int a;
        int b;
        int c;
        int temp = 0;

        a = 1;
        b = -2;
        c = -3;

        if(a < 0){
            temp++;
        }

        if(b < 0){
            temp++;
        }

        if(c < 0){
            temp++;
        }

        System.out.println("Количество отрицательных чисел среди a, b, c, - " + temp);
    }
}
