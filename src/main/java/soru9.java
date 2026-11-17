import java.util.Scanner;
public class soru9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int toplam=0;
                int poz=0;
                        int neg=0;
                                int sıfır=0;
                                
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + ".  sayiyi giriniz");
            int sayi = sc.nextInt();
            toplam = toplam + sayi;
            
            if (sayi>0){
                poz++;
            }
            else if (sayi<0){
                neg++;
            } else {
                sıfır++;
            }
        }
        
        double ort = toplam / 10;
        
        System.out.println("toplam:" + toplam);
        System.out.println("ortalama" + ort);
        System.out.println("pozitif sayi:" + poz);
        System.out.println("negatif sayi:" + neg);
        System.out.println("sifir sayisi:" + sıfır);
    }
    
}
