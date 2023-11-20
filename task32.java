import java.util.Scanner;

public class task32 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите объем тела ");
        double V = new Double(scanner.nextLine());
        System.out.println("Введите массу тела ");
        double m = new Double(scanner.nextLine());
        System.out.println("Плотность материала: "+m/V);
    }
}
