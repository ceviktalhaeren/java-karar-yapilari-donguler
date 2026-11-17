import java.util.Scanner;



public class Soru8 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         
         
         int tahsay = 37;
         int tahmin = 0;
                 
                 
         while (tahsay != tahmin) {
            
             System.out.println("Tahmininizi giriniz");
              tahmin = sc.nextInt();
         
             if (tahmin>tahsay){
                 System.out.println("daha kucuk bir sayi");
             }
             else if (tahsay>tahmin){
                     System.out.println("daha buyuk bir sayi");
         }else {
                 System.out.println("TEBRIKLER");
             }
    
                         
}
    }
}
