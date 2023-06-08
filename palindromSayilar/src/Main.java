public class Main {
    static boolean isPolindrom(int number){
        int temp = number, reverseNumber = 0, lastNumber;

        while( temp != 0){
            lastNumber = temp%10 ;
            reverseNumber = (reverseNumber * 10) + lastNumber;
            temp /= 10;

        }
        if(number == reverseNumber){
            System.out.println(number + " Sayımız polindrom sayıdır." );
        }else{
            System.out.println(number + " Sayımız polindrom sayı değildir.");
        }
        return true;
    }
    public static void main(String[] args) {

        isPolindrom(345);
        isPolindrom(23432);
    }
}