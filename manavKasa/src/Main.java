import java.util.Scanner;

public class  Main {
    public static void main(String[] args) {

        Scanner userEntry = new Scanner(System.in);
        System.out.print("Armut KG :");
        double armut = userEntry.nextDouble();
        System.out.print("Elma KG :");
        double elma = userEntry.nextDouble();
        System.out.print("Domates KG :");
        double domates = userEntry.nextDouble();
        System.out.print("Muz KG :");
        double muz = userEntry.nextDouble();
        System.out.print("Patlican KG :");
        double patlican = userEntry.nextDouble();

        double toplamTutar = (armut * 2.14) + (elma * 3.67) + (domates * 1.11) + (muz * 0.95) + (patlican * 5);
        System.out.print("Toplam tutar:" + toplamTutar + "TL");

    }

}
