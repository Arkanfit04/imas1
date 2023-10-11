import java.util.Scanner;

public class tugas03 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        double bilanganReal = scan.nextDouble();


        double hasilPenambahan = bilanganReal + 0.5;

        int bilanganBulat = (int) hasilPenambahan;

        System.out.println(bilanganBulat);
    


    }
}