import java.util.Scanner;
public class Soru10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("---MENU---");
        System.out.println("1-Sayinin karesini hesapla");
        System.out.println("2-Sayinin kupunu hesapla");
        System.out.println("3-TEK sayi mi CIFT sayi mi");
        System.out.println("4-Pozitif Negatif veya Sifir mi");
        System.out.println("5-Sistemden cikis yap");
        
        int secim = sc.nextInt();
        double sayi;
        
        
        switch (secim ) {
            case 1:
                System.out.println("Bir Sayi Giriniz:");
                sayi = sc.nextDouble();
                System.out.println("sayinin karesi:  " + (sayi*sayi));
                break;
                
                
            case 2:
                System.out.println("Bir Sayi Giriniz:");
                 sayi = sc.nextDouble();
                 System.out.println("sayinin kupu:  " + (sayi*sayi*sayi));
                 break;
                 
            case 3:
                System.out.println("Bir Sayi Giriniz:");
                 int sayi11 = sc.nextInt(); // yeni bir değişken yaptım çünkü önceden double tanımlamıştık
                 if (sayi11 % 2 ==0) {
                     System.out.println("Cift sayidir");
                 }else {
                     System.out.println("tek sayidir");
                 }
                 break;
                 
            case 4:
                System.out.println("Bir Sayi Giriniz:");
                 int sayi1 = sc.nextInt(); //yine yeni değişken
                 if (sayi1>0){
                     System.out.println("Pozitifdir");
                 }
                 else if (sayi1<0) {
                     System.out.println("negatifdir");
                 }else {
                     System.out.println("0 giridiniz NOTR");
                 }
                 break;
                 
                 
            case 5:
                System.out.println("PROGRAM kapatiliyor...");
                 break;
                 
                 
                 
            default:
                System.out.println("HATA!!! " + "yanlis giris");
        }
        
        
        
    }
    
}
