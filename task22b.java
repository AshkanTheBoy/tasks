import java.util.Scanner;

public class task22b {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("x = 12(a*a)+7a-17\nEnter A");
        Double input = new Double(scanner.nextLine());
        double a = input;
        double x = ((12*Math.pow(a,2))+(7*a)-17);
        System.out.println(x);
    }
}
