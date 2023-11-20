import java.util.Scanner;

public class task57 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите значение температуры по Цельсию");
        double a = Double.parseDouble(scanner.nextLine());
        System.out.println("Заданная температура по шкале Фаренгейта: "+(a*1.8+32));
        System.out.println("Заданная температура по шкале Кельвина: "+(a+273.15));
    }
}
