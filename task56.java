import java.util.Scanner;

public class task56 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Скорость первого автомобиля (км/ч)");
        double a = Double.valueOf(scanner.nextLine());
        System.out.println("Введите скорость второго автомобиля. Она должна быть меньше скорости первого");
        double b = Double.valueOf(scanner.nextLine());

        while (b >= a) {
            System.out.println("Введите скорость второго автомобиля. Она должна быть меньше скорости первого");
            b = Double.valueOf(scanner.nextLine());
        }

        System.out.println("Введите километр, на котором первый автомобиль опередил второй");
        int c = Integer.valueOf(scanner.nextLine());

        System.out.println("Расстояние между автомобилями спустя 30 минут после обгона на "+c+" километре: "+(a-b)/2+"км");

    }
}
