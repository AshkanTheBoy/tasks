import java.util.Scanner;

public class task41 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("a = sqrt(pow(|e-3/f|,3)+g)");
        System.out.println("b = sin e +pow(cos h,2)");
        System.out.println("c = 33g/(ef-3)");
        System.out.println("Введите e");
        double e = new Double(scanner.nextLine());
        System.out.println("Веддите f");
        double f = new Double(scanner.nextLine());
        System.out.println("Веддите g");
        double g = new Double(scanner.nextLine());
        System.out.println("Веддите h");
        double h = new Double(scanner.nextLine());
        double a = Math.sqrt(Math.pow(Math.abs(e-3),3)+g);
        double b = Math.sin(e)+Math.pow(Math.cos(h),2);
        double c = 33*g/(e*f-3);
        System.out.println("a = "+a+"\nb = "+b+"\nc = "+c);
    }
}
