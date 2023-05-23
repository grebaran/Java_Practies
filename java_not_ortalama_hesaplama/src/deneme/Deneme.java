package deneme;


import java.util.Scanner;

public class Deneme {
    public static void main(String[] args){
    /*Java ile Matematik, Fizik, Kimya, Türkçe, Tarih, Müzik derslerinin sınav puanlarını kullanıcıdan
     alan ve ortalamalarını hesaplayıp ekrana bastırılan programı yazın.

     Aynı program içerisinde koşullu ifadeler kullanılarak, eğer kullanıcının ortalaması 60'dan büyük
     ise ekrana "Sınıfı Geçti" , küçük ise "Sınıfta Kaldı" yazsın.
     */

        Scanner input=new Scanner(System.in);

        System.out.print("Lütfen Matematik Notunuzu Giriniz: ");
        float mat=input.nextInt();

        System.out.print("Lütfen Tarih Notunuzu Giriniz: ");
        float tarih=input.nextInt();

        System.out.print("Lütfen Fizik Notunuzu Giriniz: ");
        float fizik=input.nextInt();

        System.out.print("Lütfen Kimya Notunuzu Giriniz: ");
        float kimya=input.nextInt();

        System.out.print("Lütfen Türkçe Notunuzu Giriniz: ");
        float turkce=input.nextInt();

        System.out.print("Lütfen Müzik Notunuzu Giriniz: ");
        float muzik=input.nextInt();

        float ortalama=(mat+fizik+kimya+turkce+muzik+tarih)/6;
        System.out.println("Ortalamanız : "+ortalama);
        System.out.println("Geçme Durumu : "+((ortalama>60)?"Geçti":"Kaldı"));

    }
}
