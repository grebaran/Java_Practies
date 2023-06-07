import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*

        Java döngüler ile 0'dan girilen sayıya kadar olan sayılardan 3 ve 4'e tam bölünen sayıların ortalamasını
        hesaplayan programı yazınız.
         */

        Scanner input =new Scanner(System.in);

        System.out.print("Bir sayi girin lütfen : ");
        float k=input.nextFloat();

        float sum=0;
        float bolme=0;

        for (int i=0;i<=k;i++){
            if(i%3==0||i%4==0) {
                sum+=i;
                bolme+=1;
            }
        }
        System.out.println("Sonuç : "+sum/bolme);
    }
}