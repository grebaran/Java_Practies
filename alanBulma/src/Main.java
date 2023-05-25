import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*Java ile kullanıcıdan dik kenarlarının uzunluğunu alan ve hipotenüsü hesaplayan programı yazın.

        Ödev
        Üç kenar uzunluğunu kullanıcıdan aldığınız üçgenin alanını hesaplayan programı yazınız.

        Formül
        Üç𝑔𝑒𝑛𝑖𝑛 ç𝑒𝑣𝑟𝑒𝑠𝑖 = 2𝑢

        𝑢 = (a+b+c) / 2

        Alan * Alan = 𝑢 * (𝑢 − 𝑎)* (𝑢 − 𝑏) * (𝑢 − 𝑐)*/

        Scanner input=new Scanner(System.in);

        System.out.print("1.Kenar uzunluğunu giriniz: ");
        int uzunluk1=input.nextInt();

        System.out.print("2.Kenar uzunluğunu giriniz: ");
        int uzunluk2=input.nextInt();

        System.out.print("3.Kenar uzunluğunu giriniz: ");
        int uzunluk3=input.nextInt();

        float cevre= (uzunluk1 + uzunluk2 + uzunluk3) /2.0f;

        float sonuc= (float) Math.sqrt(cevre*(cevre-uzunluk1)*(cevre-uzunluk2)*(cevre-uzunluk3));

        System.out.println("Sonuc : "+ sonuc);
    }
}