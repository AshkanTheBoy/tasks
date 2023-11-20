import java.util.Scanner;

public class task47 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] firstDot = {0,0};
        double[] secondDot = {0,0};

        System.out.println("Введите координату 'x' первой точки: ");
        double x = new Double(scanner.nextLine());
        firstDot[0] = x;
        System.out.println("Введите координату 'y' первой точки: ");
        double y = new Double(scanner.nextLine());
        firstDot[1] = y;
        System.out.println("Введите координату 'x' второй точки: ");
        double a = new Double(scanner.nextLine());
        secondDot[0] = a;
        System.out.println("Введите координату 'y' второй точки: ");
        double b = new Double(scanner.nextLine());
        secondDot[1] = b;

        double dots = Math.sqrt(Math.pow((secondDot[0]-firstDot[0]),2) + (Math.pow((secondDot[1]-firstDot[1]),2)));
        System.out.println("Расстояние между точками: "+dots);



    }
}
