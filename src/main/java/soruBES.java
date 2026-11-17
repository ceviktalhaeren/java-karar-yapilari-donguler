import java.util.Scanner;
public class soruBES {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bir sayi giriniz");
       int bassay =0;
         int sayi = sc.nextInt();
          if (sayi<0) {
              System.out.println("negatif bir sayi girdin HATA!!!!");
          }
          else if  (sayi==0){
             System.out.println("HATA !!! 0 girdin");
         }else {
              
         
            while ( sayi>0){
                sayi=sayi/10;
                bassay++;
                
            }
                  
              }
              System.out.println("girdigin sayinin basamak sayisi :" + bassay);
          }
    }

