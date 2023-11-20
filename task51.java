import java.util.Arrays;

public class task51 {
    public static void main(String[] args) {
        //Scanner scanner = new Scanner(System.in);
        /* Создаем четырехугольник */
        double[] A = {0,5};
        double[] B = {2,10};
        double[] C = {10,5};
        double[] D = {2,0};

        /*
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
        System.out.println("Введите координату 'x' четвертой точки: ");
        D[0] = Double.parseDouble(scanner.nextLine());
        System.out.println("Введите координату 'y' четвертой точки: ");
        D[1] = Double.parseDouble(scanner.nextLine());
        */

        /* Выводим "координаты" */
        System.out.println(Arrays.toString(A) +"\n"+Arrays.toString(B)+"\n"+Arrays.toString(C)+"\n"+Arrays.toString(D));

        /* Считаем и выводим длины сторон четырехугольника */
        double ab = Math.sqrt(Math.pow((B[0]-A[0]),2) + (Math.pow((B[1]-A[1]),2)));
        double bc = Math.sqrt(Math.pow((C[0]-B[0]),2) + (Math.pow((C[1]-B[1]),2)));
        double cd = Math.sqrt(Math.pow((D[0]-C[0]),2) + (Math.pow((D[1]-C[1]),2)));
        double da = Math.sqrt(Math.pow((A[0]-D[0]),2) + (Math.pow((A[1]-D[1]),2)));
        System.out.println();
        System.out.println(ab);
        System.out.println(bc);
        System.out.println(cd);
        System.out.println(da);

        /* Считаем и выводим диагонали */
        double bd = Math.sqrt(Math.pow((D[0]-B[0]),2) + (Math.pow((D[1]-B[1]),2)));
        double ac = Math.sqrt(Math.pow((C[0]-A[0]),2) + (Math.pow((C[1]-A[1]),2)));
        System.out.println();
        System.out.println(bd);
        System.out.println(ac);

        /* Считаем координаты точки пересечения */
        //double[] O = {(A[0]+C[0])/2, (A[1]+C[1])/2};
        double[] O = {(B[0]+D[0])/2, (B[1]+D[1])/2};
        System.out.println(Arrays.toString(O));

        /* Выводим длины отрезков от точки пересечения к вершинам */
        double bo = Math.sqrt(Math.pow((O[0]-B[0]),2) + (Math.pow((O[1]-B[1]),2)));
        double co = Math.sqrt(Math.pow((O[0]-C[0]),2) + (Math.pow((O[1]-C[1]),2)));
        double ao = Math.sqrt(Math.pow((O[0]-A[0]),2) + (Math.pow((O[1]-A[1]),2)));
        double dO = Math.sqrt(Math.pow((O[0]-D[0]),2) + (Math.pow((O[1]-D[1]),2)));
        System.out.println();
        System.out.println(bo);
        System.out.println(co);
        System.out.println(ao);
        System.out.println(dO);

        /* Периметр треугольников */
        double Paob = ab+bo+ao;
        double Pboc = bc+co+bo;
        double Pcod = co+dO+cd;
        double Pdoa = dO+ao+da;
        System.out.println();
        System.out.println(Paob);
        System.out.println(Pboc);
        System.out.println(Pcod);
        System.out.println(Pdoa);

        /* Полупериметр для формулы Герона */
        double paob = Paob/2;
        double pboc = Pboc/2;
        double pcod = Pcod/2;
        double pdoa = Pdoa/2;
        System.out.println();
        System.out.println(paob);
        System.out.println(pboc);
        System.out.println(pcod);
        System.out.println(pdoa);

        /* Площади треугольников */
        double Saob = Math.sqrt(paob*(paob-ab)*(paob-bo)*(paob-ao));
        double Sboc = Math.sqrt(pboc*(pboc-bc)*(pboc-co)*(pboc-bo));
        double Scod = Math.sqrt(pcod*(pcod-co)*(pcod-dO)*(pcod-cd));
        double Sdoa = Math.sqrt(pdoa*(pdoa-dO)*(pdoa-ao)*(pdoa-da));
        System.out.println();
        System.out.println(Saob);
        System.out.println(Sboc);
        System.out.println(Scod);
        System.out.println(Sdoa);

        /* Площадь четырехугольника */
        double Sabcd = Saob+Sboc+Scod+Sdoa;
        System.out.println();
        System.out.println("Площадь четырехугольника: "+Sabcd);



    }
}

