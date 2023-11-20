import java.util.Scanner;

public class task53 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Компьютер состоит из монитора, системного блока, клавиатуры и мыши");
        System.out.println("Введите стоимость монитора");
        double a = Double.valueOf(scanner.nextLine());
        System.out.println("Введите стоимость блока");
        double b = Double.valueOf(scanner.nextLine());
        System.out.println("Введите стоимость клавиатуры");
        double c = Double.valueOf(scanner.nextLine());
        System.out.println("Введите стоимость мыши");
        double d = Double.valueOf(scanner.nextLine());
        System.out.println("Введите кол-во покупаемых компьютеров");
        double n = Double.valueOf(scanner.nextLine());

        System.out.println("Стоимость "+n+"компьютера(ов): "+(a+b+c+d)*n);
    }
}
