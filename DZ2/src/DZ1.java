import java.util.Scanner;

public class DZ1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите длину прямоугольника");
        double lenght = scanner.nextDouble();

        System.out.print("Введите ширину прямогульника");
        double wight = scanner.nextDouble();

        double perimetr = 2 * (lenght + wight);
        double area = lenght * wight;

        System.out.println("Периметр прямогульника =" + perimetr);
        System.out.println("Периметр прямоугольника =" + area);
    }

}
