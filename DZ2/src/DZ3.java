import java.util.Scanner;

public class DZ3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число для таблицы умножения");
        int n = scanner.nextInt();

        System.out.println("Таблица умножения для " + n + ":");
        for (int i = 1; i <= 10; i++){
            System.out.println(n + "x" + i + " = " + (n*i));
        }
    }
}
