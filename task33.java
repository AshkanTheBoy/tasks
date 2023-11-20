import java.util.Scanner;

public class task33 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите кол-во жителей ");
        double V = new Double(scanner.nextLine());
        System.out.println("Введите площадь территории ");
        double m = new Double(scanner.nextLine());
        System.out.println("Плотность населения: "+V/m);
    }
}
