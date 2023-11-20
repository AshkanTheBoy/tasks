import java.util.Scanner;

public class task38 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длину большего основания");
        double a = new Double(scanner.nextLine());
        System.out.println("Введите длину меньшего основания");
        double b = new Double(scanner.nextLine());
        System.out.println("Введите длину высоты трапеции");
        double h = new Double(scanner.nextLine());
        /*
        Периметр: P=a+b+2c
        Сторону "с" найдем по основам a,b и высоте h
         */
        double c = Math.sqrt(Math.pow((a-b)/2,2)+Math.pow(h,2));
        System.out.println("Периметр: "+(a+b+2*c));
    }
}
