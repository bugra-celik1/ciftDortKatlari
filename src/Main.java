import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int b;
        int toplam = 0;
        Scanner scan = new Scanner(System.in);

        do {
            System.out.print("Sayı giriniz:");
            b = scan.nextInt();
            if ( b % 4 == 0) {
                toplam += b;
            }
        }while (b % 2 == 0) ;

        System.out.println("TOPLAM :" +toplam);






    }
}