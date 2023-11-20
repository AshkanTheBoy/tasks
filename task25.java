import java.util.Scanner;

public class task25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сторону квадрата");
        double x = new Double(scanner.nextLine());
        double y = x*4;
        System.out.println("Периметр квадрата: "+y);
    }
}
