import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Java ile kullanıcıların manavdan almış oldukları ürünlerin kilogram değerlerine göre toplam tutarını ekrana yazdıran programı yazın.

        Meyveler ve KG Fiyatları

        Armut : 2,14 TL
        Elma : 3,67 TL
        Domates : 1,11 TL
        Muz: 0,95 TL
        Patlıcan : 5,00 TL

        */
        float armut=2.14f;
        float elma=3.67f;
        float domates=1.11f;
        float muz = 0.95f;
        float patlican=5.0f;

        Scanner input = new Scanner(System.in);

        System.out.print("Armut kaç kilo? : ");
        float armutKilo=input.nextFloat();
        float armutTutar=(armutKilo*armut);

        System.out.print("Elma kaç kilo? : ");
        float elmaKilo=input.nextFloat();
        float elmaTutar=(elmaKilo*elma);

        System.out.print("Domates kaç kilo? : ");
        float domatesKilo=input.nextFloat();
        float domatesTutar=(domatesKilo*domates);

        System.out.print("Muz kaç kilo? : ");
        float muzKilo=input.nextFloat();
        float muzTutar=(muzKilo*muz);

        System.out.print("Armut kaç kilo? : ");
        float patlicanKilo=input.nextFloat();
        float patlicanTutar=(patlicanKilo*patlican);

        float sonuc=(armutTutar+domatesTutar+elmaTutar+patlicanTutar+muzTutar);
        System.out.println("Toplam Tutar : "+sonuc+" TL");
    }
}