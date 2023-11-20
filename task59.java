import java.util.Scanner;

public class task59 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число");
        int a = Integer.parseInt(scanner.nextLine());
        System.out.println("Введите второе число");
        int b = Integer.parseInt(scanner.nextLine());
        int a1 = b;
        int b1 = a;
        a = a1;
        b = b1;
        System.out.println("После обмена, значения 'a' и 'b' соответственно: "+a+" "+b);
    }
}
