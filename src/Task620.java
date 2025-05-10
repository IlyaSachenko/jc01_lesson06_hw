public class Task620 {
    public static void main(String[] args) {
        int a;
        int b;
        int c;
        int k;

        a = 9;
        b = 12;
        c = 14;
        k = 3;

        if(a % k == 0){
            System.out.println("Число k является делителем числа а");
        }else{
            System.out.println("Число k не является делителем числа а");
        }

        if(b % k == 0){
            System.out.println("Число k является делителем числа b");
        }else{
            System.out.println("Число k не является делителем числа b");
        }

        if(c % k == 0){
            System.out.println("Число k является делителем числа c");
        }else{
            System.out.println("Число k не является делителем числа c");
        }
    }
}
