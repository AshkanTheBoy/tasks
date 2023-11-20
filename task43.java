import java.util.Scanner;

public class task43 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число ");
        double x = new Double(scanner.nextLine());
        System.out.println("Введите второе число ");
        double y = new Double(scanner.nextLine());
        System.out.println("Среднее арифметическое: "+Math.abs((x+y)/2));
        System.out.println("Среднее геометрическое: "+Math.abs(Math.sqrt(x*y)));
    }
}
