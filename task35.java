import java.util.Scanner;

public class task35 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длину первого катета");
        double a = new Double(scanner.nextLine());
        System.out.println("Введите длину второго катета");
        double b = new Double(scanner.nextLine());
        System.out.println("Длина гипотенузы: "+(Math.sqrt(Math.pow(a,2)+Math.pow(b,2))));
    }
}
