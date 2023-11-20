import java.util.Scanner;

public class task29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите радиус окружности");
        double R = new Double(scanner.nextLine());
        System.out.println("Длина окружности: "+2*3.14*R+"\nПлощадь круга: "+3.14*Math.pow(R,2));
        /*
        R равен введенному числу, так как не присваиваются новые значения
        */
    }
}
