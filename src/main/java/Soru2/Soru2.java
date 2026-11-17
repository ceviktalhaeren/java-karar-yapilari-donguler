import java.util.Scanner;

public class Soru2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in);
        System.out.println("bir n sayisi girer misin");
        int n = sc.nextInt();
        int ctop = 0 ;  // çift sayıların 
        int ttop = 0;  // tek sayıların toplamı
        for (int i = 1; i <= n; i++) {
            if ( i%2==0)  {
               ctop +=i ;
            } else {
                ttop +=i;
            }
           
        }
         System.out.println("cift sayiarin toplami" + ctop);
         System.out.println("tek sayilarin toplami" + ttop);
    }
}

