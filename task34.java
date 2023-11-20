import java.util.Scanner;

public class task34 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ax+b=0, a!=0");
        System.out.println("Введите 'a'");
        double a = new Double(scanner.nextLine());
        System.out.println("Введите 'b'");
        double b = new Double(scanner.nextLine());
        System.out.println("x = -b/a = "+(-b)/a);
    }
}
