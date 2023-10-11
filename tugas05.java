import java.util.Scanner;

public class tugas05 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        int angka1 = scan.nextInt();
        int angka2 = scan.nextInt();
        int angka3 = scan.nextInt();

        int sementara;

        if (angka1 > angka2) {
            sementara = angka1;
            angka1 = angka2;
            angka2 = sementara;
        }
        if (angka1 > angka3) {
            sementara = angka1;
            angka1 = angka3;
            angka3 = sementara;
        }
        if (angka2 > angka3) {
            sementara = angka2;
            angka2 = angka3;
            angka3 = sementara;
        }


        System.out.printf("%d, %d, %d", angka1, angka2, angka3);
    

    }
}