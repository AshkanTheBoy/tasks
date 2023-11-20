import java.util.Scanner;

public class task45 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число ");
        double a = new Double(scanner.nextLine());
        System.out.println("Введите второе число");
        double b = new Double(scanner.nextLine());
        System.out.println("Сумма: "+(a+b));
        System.out.println("Разность: "+(a-b));
        System.out.println("Произведение: "+(a*b));
        System.out.println("Частное: "+(a/b));
    }
}
