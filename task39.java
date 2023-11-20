import java.util.Scanner;

public class task39 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("z = x+(2+y)/x*x/(y+1/sqrt(x*x+10))");
        System.out.println("q = 2.8sinx+|y|");
        System.out.println("Введите x");
        double x = new Double(scanner.nextLine());
        System.out.println("Веддите y");
        double y = new Double(scanner.nextLine());
        double z = x+(2+y)/x*x/(y+1/Math.sqrt(x*x+10));
        double q = 2.8*Math.sin(x)+Math.abs(y);
        System.out.println("z = "+z+"\n"+"q = "+q);
    }
}
