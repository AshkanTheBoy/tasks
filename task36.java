import java.util.Scanner;

public class task36 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите радиус внешнего кольца");
        double a = new Double(scanner.nextLine());
        System.out.println("Введите радиус внутреннего кольца");
        double b = new Double(scanner.nextLine());
        System.out.println("Площадь кольца: "+(3.14*Math.pow(a,2)-3.14*Math.pow(b,2)));
    }
}
