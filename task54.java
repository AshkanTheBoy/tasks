import java.util.Scanner;

public class task54 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите возраст Тани");
        double x = Double.valueOf(scanner.nextLine());
        System.out.println("Введите возраст Мити");
        double y = Double.valueOf(scanner.nextLine());
        System.out.println("Средний возраст: "+(x+y)/2);
        System.out.println("Возраст Тани отличается от среднего на: "+Math.abs(x-(x+y)/2));
        System.out.println("Возраст Мити отличается от среднего на: "+Math.abs(y-(x+y)/2));
    }
}
