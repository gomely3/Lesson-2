import java.util.Scanner;

public class DZ4 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите чилсо для вычисления Фибоначи");
        int n = scanner.nextInt();

        if (n < 0) {
            System.out.println(("Ошибка это должно быть не отрицательно число"));
        } else {
            long fib = fibonacci(n);
            System.out.println(n + "-е число Фибоначи" + fib);
        }
    }
    public static long fibonacci(int n){
        if( n == 0) return 0;
        if( n == 1) return 1;

        long a = 0, b = 1;
        for (int i = 2; i <= n; i++){
            long temp = a + b;
            a = b;
            b = temp;
        }
        return b;
    }
}
