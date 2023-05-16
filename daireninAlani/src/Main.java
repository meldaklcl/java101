import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Daire diliminin yarı çapını giriniz : ");
        double r = input.nextDouble();

        System.out.print("Daire diliminin merkez açısının ölçüsünü girin : ");
        double alpha = input.nextDouble();

        double pi = 3.14;
        double area = (pi * (r * r) * alpha) / 360;

        System.out.println("Daire diliminin alanı : " + area);
    }
}
