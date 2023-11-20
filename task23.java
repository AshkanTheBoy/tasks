import java.util.Scanner;

public class task23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("y = (a*a)+10/sqrt((a*a)+1)\nEnter 'a'");
        Double input = new Double(scanner.nextLine());
        double a = input;
        double y = ((Math.pow(a,2)+10)/Math.sqrt(Math.pow(a,2)+1));
        System.out.println(y);
    }
}
