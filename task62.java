import java.util.Scanner;

public class task62 {
    public static void main(String[] args) {
        System.out.println("Введите число");
        Scanner scanner = new Scanner(System.in);
        double a = Double.parseDouble(scanner.nextLine());
        double ap2 = Math.pow(a,2);
        double ap4 = Math.pow(a,4);
        double ap6 = Math.pow(a,6);

        /* pow(a,3) & pow(a,10) in 4 */
        double ap3 = ap2*a;
        double ap10 = ap4*ap4*a*a;
        System.out.println(ap3+" "+ap10);

        /* pow(a,4) & pow(a,20) in 4 */
        ap4 = a*a*a*a;
        double ap20 = ap10*ap6*ap4;
        System.out.println(ap4+" "+ap20);

        /* pow(a,5) & pow(a,13) in 5 */
        double ap5 = ap2*ap2*a;
        double ap13 = ap10*a*a*a;
        System.out.println(ap5+" "+ap13);

        /* pow(a,5) & pow(a,19) in 5 */
        ap5 = ap3*ap2;
        double ap19 = ap6*ap5*ap4*ap3*a;
        System.out.println(ap5+" "+ap19);

        /* pow(a,2) & pow(a,5) & pow(a,17) in 6 */
        ap5 = a*a*a*a*a;
        ap2 = ap2*1;
        double ap17 = ap13*ap4;
        System.out.println(ap2+" "+ap5+" "+ap17);

        /* pow(a,4) & pow(a,12) & pow(a,28) in 6 */
        ap4 = ap2*a*a;
        double ap12 = ap4*ap4*ap4;
        double ap28 = ap17*ap5*ap6;
        System.out.println(ap4+" "+ap12+" "+ap28);

    }
}
