import java.util.Scanner;

public class task40 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("x = (2/(a*a+25)+b)/(sqrt(b)+(a+b)/2)");
        System.out.println("y = (|a|+2sinb)/5.5a");
        System.out.println("Введите a");
        double a = new Double(scanner.nextLine());
        System.out.println("Веддите b");
        double b = new Double(scanner.nextLine());
        double x = (2/(a*a+25)+b)/(Math.sqrt(b)+(a+b)/2);
        double y = (Math.abs(a)+2*Math.sin(b)/5.5*a);
        System.out.println("x = "+x+"\n"+"y = "+y);
    }
}
