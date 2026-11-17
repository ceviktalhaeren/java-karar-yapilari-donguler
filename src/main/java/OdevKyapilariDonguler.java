
import java.util.Scanner;


public class OdevKyapilariDonguler {

    
   
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Lutfen Bir Sayi giriniz:");
        int sayi = sc.nextInt(); 
       System.out.println("1 den girdigin sayıya kadar olan sayilar:" );
        for (int i = 1; i <= sayi; i++) {
             System.out.println(i);
        }
    }
}
