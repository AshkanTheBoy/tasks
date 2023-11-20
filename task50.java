import java.util.Arrays;
import java.util.Scanner;

public class task50 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /* Создаем "плоскость" */
        double[] A = {0,0};
        double[] B = {0,0};
        double[] C = {0,0};

        /* Задаем координаты точек */
        System.out.println("Введите координату 'x' первой точки: ");
        A[0] = Double.parseDouble(scanner.nextLine());
        System.out.println("Введите координату 'y' первой точки: ");
        A[1] = Double.parseDouble(scanner.nextLine());
        System.out.println("Введите координату 'x' второй точки: ");
        B[0] = Double.parseDouble(scanner.nextLine());
        System.out.println("Введите координату 'y' второй точки: ");
        B[1] = Double.parseDouble(scanner.nextLine());
        System.out.println("Введите координату 'x' третьей точки: ");
        C[0] = Double.parseDouble(scanner.nextLine());
        System.out.println("Введите координату 'y' третьей точки: ");
        C[1] = Double.parseDouble(scanner.nextLine());

        /* выводим координаты */
        System.out.println(Arrays.toString(A) +"\n"+Arrays.toString(B)+"\n"+Arrays.toString(C));

        /* считаем и выводим длины сторон треугольника ABC */
        double ab = Math.sqrt(Math.pow((B[0]-A[0]),2) + (Math.pow((B[1]-A[1]),2)));
        double bc = Math.sqrt(Math.pow((C[0]-B[0]),2) + (Math.pow((C[1]-B[1]),2)));
        double ac = Math.sqrt(Math.pow((C[0]-A[0]),2) + (Math.pow((C[1]-A[1]),2)));
        System.out.println(ab+"\n"+bc+"\n"+ac);

        double P = ab+bc+ac;
        System.out.println("Периметр треугольника: "+P);

        double S = 0.5*Math.abs((B[0]-A[0])*(C[1]-A[1])*(C[0]-A[0])*(B[1]-A[1]));
        System.out.println("Площадь треугольника: "+S);


    }
}
