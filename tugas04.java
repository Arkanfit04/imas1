import java.util.Scanner;

public class tugas04 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        int angka1 = scan.nextInt();

        int angka2 = scan.nextInt();

        if (angka1 < angka2) {
            System.out.println(angka1);
            System.out.println(angka2);
        } else if (angka2 < angka1) {
            System.out.println(angka2);
            System.out.println(angka1);
        } else {
            System.out.println(angka1);
        }

    }
}