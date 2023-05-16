import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int km;
        double perkm=0.20, total, startPrice=10;
        Scanner scan=new Scanner(System.in);
        System.out.println("Mesafeyi Km cinsinden giriniz:  ");
        km=scan.nextInt();

        total=km*perkm;
        total+=startPrice;
        total=(total<20)? 20:total;
        System.out.println("Toplam Tutar: " + total);

    }
}
