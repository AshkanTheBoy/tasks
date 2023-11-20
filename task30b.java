import java.util.Scanner;

public class task30b {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("x = 3.56a+(bbb)-5.8(bb)+3.8a-1.5\nEnter 'a'");
        double a = new Double(scanner.nextLine());
        System.out.println("Введите 'b'");
        double b = new Double(scanner.nextLine());
        double x = (3.56*a+Math.pow(b,3))-(5.8*Math.pow(b,2))+(3.8*a)-1.5;
        System.out.println(x);
    }
}
