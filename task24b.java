import java.util.Scanner;

public class task24b {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("y = sin(3,2+sqrt(1+x)/|5x|)\nEnter 'x'");
        double x = new Double(scanner.nextLine());
        double y = Math.sin(3.2+Math.sqrt(1+x)/Math.abs(5*x));
        System.out.println(y);
    }
}
