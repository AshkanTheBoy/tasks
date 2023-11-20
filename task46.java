import java.util.Scanner;

public class task46 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первую сторону параллелепипеда");
        double a = new Double(scanner.nextLine());
        System.out.println("Введите вторую сторону параллелепипеда");
        double b = new Double(scanner.nextLine());
        System.out.println("Введите третью сторону параллелепипеда");
        double c = new Double(scanner.nextLine());
        System.out.println("Объем: "+a*b*c);
        System.out.println("Площадь поверхности: "+((2*a*b)+(2*a*c)+(2*b*c)));

    }
}
