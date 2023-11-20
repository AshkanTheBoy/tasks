import java.util.Scanner;

public class task31 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число ");
        double x = new Double(scanner.nextLine());
        System.out.println("Введите второе число ");
        double y = new Double(scanner.nextLine());
        System.out.println("Среднее арифметическое: "+(x+y)/2);
        System.out.println("Среднее геометрическое: "+Math.sqrt(x*y));
    }
}
