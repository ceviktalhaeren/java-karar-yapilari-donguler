import java.util.Scanner;
public class SoruÜC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("bir sayi giriniz bu sayinin carpim tablosu yapilacak:");
        int sayi = sc.nextInt();
        for (int i = 1; i <=10; i++) {
            int sonuc = sayi *i ;
            System.out.println(sayi + "x" + i + "=" + sonuc);
            
        }
                
    }
    
}
