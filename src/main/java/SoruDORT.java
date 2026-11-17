import java.util.Scanner;

public class SoruDORT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         System.out.println("Lutfen Faktoriyeli Hesaplanacak Bir Sayi Giriniz:");
          int sayi = sc.nextInt();
           long faktoryel  =1;
          
          if (sayi<0) {
              System.out.println("negatif bir sayi girdin HATA!!!!");
              
          }else{
             
              for (int i = 1; i <= sayi; i++) {
                  faktoryel *= i;
                   
              }
          }
        System.out.println(sayi + "! = " +   faktoryel );
    }
}
