import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Java döngüler ile tek bir sayı girilene kadar kullanıcıdan girişleri kabul eden ve
         girilen değerlerden çift ve 4'ün katları olan sayıları toplayıp ekrana basan programı yazıyoruz.
         */
        Scanner input = new Scanner(System.in);

        int results=0;
        while(true){
            System.out.print("Lütfen bir sayı gir: ");
            int sayi=input.nextInt();
            if (sayi%2==0){
                if (sayi%4==0){
                    results+=sayi;
                }

            } else if (sayi%2==1) {
                System.out.println("Sonuç : "+results);
                break;
            }
        }
    }
}