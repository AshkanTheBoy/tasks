import java.util.Scanner;

public class task49 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длину большего основания");
        double a = Double.parseDouble(scanner.nextLine());
        System.out.println("Введите длину меньшего основания");
        double b = Double.parseDouble(scanner.nextLine());
        double A = -1;

        do { System.out.println("Введите угол при большем основании (0-180)");
             A = Double.parseDouble(scanner.nextLine());
            }
        while (A<0 || A>180);

        double S = a*b/Math.sin(A);
        System.out.println("Площадь трапеции: "+S);

    }
}
