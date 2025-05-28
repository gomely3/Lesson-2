import java.util.Scanner;

public class DZ2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите кол-во баллов от 0 до 100");
        int score = scanner.nextInt();

        if (score < 0 || score > 100) {
            System.out.println("Укажите баллы от 0 до 100");
        } else if (score >= 90) {
            System.out.println("Оценка А");
        } else if (score >= 75) {
            System.out.println("Оценка B");
        } else if (score >= 50) {
            System.out.println("Оценка С");
        } else if (score >= 30) {
            System.out.println("Оценка D");
        } else {
            System.out.println("Оценка F");
        }
    }
}
