import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*Yarıçapı r, merkez açısının ölçüsü 𝛼 olan daire diliminin alanı bulan programı yazınız.

        𝜋 sayısını = 3.14 alınız.

        Formül : (𝜋 * (r*r) * 𝛼) / 360*/
        Scanner input=new Scanner(System.in);

        float pi=3.14f;

        System.out.print("Yarı Çap Değerini Giriniz : ");
        float yaricap=input.nextFloat();

        System.out.print("Merkez Açının Ölçüsünü Giriniz : ");
        float merkezAciOlcusu=input.nextFloat();

        float results=(pi*(yaricap*yaricap)*merkezAciOlcusu)/360.0f;

        System.out.println("Yazdığınız verilere göre daire diliminin alanı : "+results);

    }
}