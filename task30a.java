import java.util.Scanner;

public class task30a {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("z = (x*x*x)-2.5xy+1.78(x*x)-2.5y+1\nВведите 'x'");
        double x = new Double(scanner.nextLine());
        System.out.println("Введите 'y'");
        double y = new Double(scanner.nextLine());
        double z = Math.pow(x,3)-2.5*x*y+1.78*Math.pow(x,2)-2.5*y+1;
        System.out.println(z);
    }
}
