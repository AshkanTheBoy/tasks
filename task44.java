import java.util.Scanner;

public class task44 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первую сторону ");
        double a = new Double(scanner.nextLine());
        System.out.println("Введите вторую сторону");
        double b = new Double(scanner.nextLine());
        System.out.println("Периметр: "+2*a*b);
        System.out.println("Диагональ: "+Math.sqrt(Math.pow(a,2)+Math.pow(b,2)));

    }
}
