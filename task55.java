import java.util.Scanner;

public class task55 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Скорость первого автомобиля (км/ч)");
        double a = Double.valueOf(scanner.nextLine());
        System.out.println("Введите скорость второго автомобиля (км/ч)");
        double b = Double.valueOf(scanner.nextLine());
        System.out.println("Введите расстояние между автомобилями (км)");
        double S = Double.valueOf(scanner.nextLine());
        System.out.println("Автомобили встретятся через: "+S/(a+b)+"ч.");
    }
}
