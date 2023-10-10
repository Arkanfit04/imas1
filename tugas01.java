import java.util.Scanner;

public class tugas01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
    
        int bilangan = scanner.nextInt();

        if (bilangan > 0) {
            System.out.println("Bilangan ini adalah bilangan positif.");
        } else if (bilangan < 0) {
            System.out.println("Bilangan ini adalah bilangan negatif.");
        } else {
            System.out.println("Bilangan ini adalah nol.");
        }

   

        
    }

}