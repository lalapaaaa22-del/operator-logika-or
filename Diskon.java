import java.util.Scanner;

public class Diskon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan total belanja: ");
        int total = input.nextInt();
        System.out.print("Apakah punya kartu member? (true/false): ");
        boolean member = input.nextBoolean();

        //test
        
        if (total >= 500000 || (member && total >= 300000)) {
            System.out.println("Kamu dapat diskon spesial!");
        } else {
            System.out.println("Belum memenuhi syarat diskon.");
        }
    }
}
