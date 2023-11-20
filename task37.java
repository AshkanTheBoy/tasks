import java.util.Scanner;

public class task37 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длину первого катета");
        double a = new Double(scanner.nextLine());
        System.out.println("Введите длину второго катета");
        double b = new Double(scanner.nextLine());
        double c = Math.sqrt(Math.pow(a,2)+Math.pow(b,2));
        System.out.println("Длина гипотенузы: "+c);
        System.out.println("Периметр: "+(a+b+c));
    }
}
