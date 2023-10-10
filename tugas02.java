import java.util.Scanner;

public class tugas02 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        int bilangan = scan.nextInt();

        if (bilangan % 2 == 0) {
            System.out.println("Bilangan ini adalah bilangan genap.");
        } else {
            System.out.println("Bilangan ini adalah bilangan ganjil.");
        }



    }
}