import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Ödev
        Bir sayının basamak sayılarının toplamını hesaplayan program yazınız.
         */

        Scanner input=new Scanner(System.in);
        System.out.print("Lütfen bir sayı giriniz : ");
        String number=input.next();

        int results=0,sayi=0;

        for(int i=0;i<number.length();i++){
            sayi= Integer.parseInt(number.substring(i,i+1));
            results+=sayi;

        }
        System.out.print(number+" rakamları'nın toplamı = "+results);

    }
}