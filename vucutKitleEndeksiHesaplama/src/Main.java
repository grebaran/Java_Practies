import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Java ile kullanıcıdan boy ve kilo değerlerini alıp bir değişkene atayın. Aşağıdaki formüle göre kullanıcının "Vücut Kitle İndeks" değerini hesaplayıp ekrana yazdırın.

        Formül
        Kilo (kg) / Boy(m) * Boy(m)
        */

        Scanner input =new Scanner(System.in);

        System.out.print("Boy (metre cinsinden giriniz): ");
        float boy=input.nextFloat();

        System.out.print("Kilo (kg cinsinden giriniz): ");
        float kilo=input.nextFloat();

        double results=kilo/(boy*boy);
        System.out.println("Vücut Kitle Endeksiniz : "+results);
    }
}