import java.util.Scanner;



public class soru6 {
   
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        
        System.out.println("Hangi sayiyi ters cevireceksin");
        int sayi = sc.nextInt();
        if (sayi<0 || sayi==0) {
            System.out.println("HATAAAAAA!!!!!");
        }
            int terss =0;
        int gecsay = sayi;
        
        
        while ( gecsay>0) {
            int basamak = gecsay % 10 ;
            terss = (terss*10) + basamak;
            gecsay = gecsay/10;
        }
            System.out.println(sayi  + " tersi " +  terss);
            
        }
       
    }


