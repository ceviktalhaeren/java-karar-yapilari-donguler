import java.util.Scanner;

public class soru7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        System.out.println(" Asal Kontrolu yapilacak sayiyi giriniz");
          int sayi = sc.nextInt();
        boolean asalmi = true;
    
    if (sayi <=  1) {
    System.out.println("HATA!!!");
     asalmi=false;
    }else{
        for (int i = 2; i <= Math.sqrt(sayi); i++) 
            if (sayi % i ==0) {
            asalmi = false;
            break;
        }
    }
    
    if (asalmi){
    System.out.println( sayi + " asaldir");
     }else{
    System.out.println( sayi + " asal degil");
}
    
    }
}
