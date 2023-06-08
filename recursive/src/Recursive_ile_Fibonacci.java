import java.util.Scanner;
public class Recursive_ile_Fibonacci {
    static int k(int sayiAdedi) {
        int ilkSayi = 0, ikinciSayi = 1, sonrakiSayi=0;
        for (int i = 2; i < sayiAdedi; i++) {
            sonrakiSayi = ilkSayi + ikinciSayi;
            System.out.println(" " + sonrakiSayi);
            ilkSayi = ikinciSayi;
            ikinciSayi = sonrakiSayi;
        }
        return sonrakiSayi;
    }
    public static void  main(String[]args){
        Scanner x=new Scanner(System.in);
        while (true) {
            System.out.print("Fibonacci serisi kaç sayı olsun? = ");
            int sayiAdedi = x.nextInt();
            k(sayiAdedi);
        }

    }
}