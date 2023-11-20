import java.util.Scanner;

public class task26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите радиус окружности");
        double R = new Double(scanner.nextLine());
        double d = 2*3.14*R;
        System.out.println("Диаметр окружности: "+d);
    }
}
