import java.util.Scanner;

public class task27 {
    public static void main(String[] args) {
        /*
        S = Math.pow(Math.pow(R+h,2)-Math.pow(R,2),0.5)
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите высоту в метрах");
        double h = new Double(scanner.nextLine());
        double R = 6350000;
        double S = Math.pow(Math.pow(R+h,2)-Math.pow(R,2),0.5);
        System.out.println(S);
        S = Math.ceil(S);
        System.out.println("Расстояние до горизонта от заданной точки: ~"+S+" м.");

    }
}
