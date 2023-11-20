import java.util.Scanner;

public class task28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длину ребра куба");
        double x = new Double(scanner.nextLine());
        System.out.println("Объем куба: "+Math.pow(x,3)+"\nПлощадь стороны: "+Math.pow(x,2));
        /*
        x равен введенному числу, так как не присваиваются новые значения
        */
    }
}
