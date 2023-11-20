import java.util.Scanner;

public class task11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] abcd = {"","","",""};
        for (int i=1; i<5; i++) {
            System.out.println("Введите "+i+"-е число");
            abcd[i-1] = String.valueOf(scanner.nextLine());
        }
        for (int i=0; i<4; i++) {
            System.out.println(abcd[i]);
        }
    }
}
