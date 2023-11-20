import java.util.Scanner;

public class task22a {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("y = 7(x*x)-3x+6\nEnter X");
        Double input = new Double(scanner.nextLine());
        double x = input;
        double y = ((7*Math.pow(x,2))-(3*x)+6);
        System.out.println(y);
    }
}
