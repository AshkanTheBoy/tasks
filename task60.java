import java.util.Scanner;

public class task60 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число");
        int a = Integer.parseInt(scanner.nextLine());
        System.out.println("Введите второе число");
        int b = Integer.parseInt(scanner.nextLine());
        System.out.println("Введите третье число");
        int c = Integer.parseInt(scanner.nextLine());
        int a1 = a;
        int b1 = b;
        int c1 = c;
        a = b1;
        b = c1;
        c = a1;
        System.out.println("После обмена, значения 'a', 'b' и 'c' соответственно: " + a + " " + b + " " + c);
    }
}
