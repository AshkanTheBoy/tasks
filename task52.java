import java.util.Scanner;

public class task52 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /* Создаем "цену" товаров на 1кг. */
        System.out.println("Введите стоимость 1кг. конфет");
        double q = Double.parseDouble(scanner.nextLine());
        System.out.println("Введите стоимость 1кг. печенья");
        double w = Double.parseDouble(scanner.nextLine());
        System.out.println("Введите стоимость 1кг. яблок");
        double e = Double.parseDouble(scanner.nextLine());

        /* Вводим вес товаров для покупки */
        System.out.println("Введите вес купленных конфет");
        double q1 = Double.parseDouble(scanner.nextLine());
        System.out.println("Введите вес купленного печенья");
        double w1 = Double.parseDouble(scanner.nextLine());
        System.out.println("Введите вес купленных яблок");
        double e1 = Double.parseDouble(scanner.nextLine());

        /* Считаем общую цену */
        System.out.println("Общая цена покупки: "+(q*q1+w*w1+e*e1));
    }
}
