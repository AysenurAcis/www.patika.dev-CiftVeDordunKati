import java.util.Scanner;

public class main {
    public static void main (String[] args){
        int n , bolunebilen = 0;
        Scanner scan = new Scanner(System.in);

        do{
            System.out.println("Sayı Giriniz : ");
            n = scan.nextInt();
            if( n % 4 == 0 ){
                bolunebilen += n;
            }
        } while(n % 2 ==0);

        System.out.println("Girilen değerlerden çift ve 4'e bölünen sayıların toplamı : " + bolunebilen);
    }
}
