import java.util.Scanner;

public class task61 {
    public static void main(String[] args) {
        System.out.println("Введите число");
        Scanner scanner = new Scanner(System.in);
        double a = Double.parseDouble(scanner.nextLine());

        /* pow(a,4) in 2 */
        double ap2 = a*a;
        double ap4 = ap2*ap2;
        System.out.println(ap4);

        /* pow(a,6) in 3 */
        double ap6 = ap4*ap2;
        System.out.println(ap6);

        /* pow(a,7) in 4 */
        double ap7 = ap6*a;
        System.out.println(ap7);

        /* pow(a,8) in 3 */
        double ap8 = ap4*ap2*a*a;
        System.out.println(ap8);

        /* pow(a,9) in 4 */
        double ap9 = ap4*ap2*a*a*a;
        System.out.println(ap9);

        /* pow(a,10) in 4 */
        double ap10 = ap4*ap2*ap2*a*a;
        System.out.println(ap10);

        /* pow(a,13) in 5 */
        double ap13 = ap4*ap2*ap2*ap2*ap2*a;
        System.out.println(ap13);

        /* pow(a,15) in 5 */
        double ap15 = ap6*ap4*ap2*a*a*a;
        System.out.println(ap15);

        /* pow(a,21) in 6 */
        double ap21 = ap6*ap6*ap4*ap2*a*a*a;
        System.out.println(ap21);

        /* pow(a,28) in 6 */
        double ap28 = ap13*ap6*ap4*ap2*a*a*a;
        System.out.println(ap28);

        /* pow(a,64) in 6 */
        double ap64 = ap28*ap21*ap9*ap2*ap2*a*a;
        System.out.println(ap64);
    }
}
