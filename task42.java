import java.util.Scanner;

public class task42 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("a = (e+f/2)/3");
        System.out.println("b = |h2-g|");
        System.out.println("c = sqrt(pow(g-h,2)-3sine)");
        System.out.println("Введите e");
        double e = new Double(scanner.nextLine());
        System.out.println("Веддите f");
        double f = new Double(scanner.nextLine());
        System.out.println("Веддите g");
        double g = new Double(scanner.nextLine());
        System.out.println("Веддите h");
        double h = new Double(scanner.nextLine());
        double a = ((e+f/2)/3);
        double b = Math.abs(Math.pow(h,2)-g);
        double c = Math.sqrt(Math.pow((g-h),2)-3*Math.sin(e));
        System.out.println("a = "+a+"\nb = "+b+"\nc = "+c);
    }
}
