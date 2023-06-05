import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Dersler : Matematik, Fizik, Türkçe, Kimya, Müzik

        Geçme Notu : 55

        Ödev
        Eğer girilen ders notları 0 veya 100 arasında değil ise ortalamaya katılmasın.
         */
        float average;
        Scanner input=new Scanner(System.in);

        System.out.print("Türkçe Notu : ");
        float turkce=input.nextFloat();

        System.out.print("Matematik Notu : ");
        float matematik=input.nextFloat();

        System.out.print("Fizik Notu : ");
        float fizik=input.nextFloat();

        System.out.print("Kimya Notu : ");
        float kimya=input.nextFloat();

        System.out.print("Müzik Notu : ");
        float muzik=input.nextFloat();

        if (!((muzik<100)&&(muzik>0))) {
            average=(turkce+kimya+matematik+fizik)/5.0f;
        } else if (!((matematik<100)&&(matematik>0))) {
            average=(turkce+kimya+muzik+fizik)/5.0f;
        }else if (!((kimya<100)&&(kimya>0))) {
            average=(turkce+muzik+matematik+fizik)/5.0f;
        }else if (!((turkce<100)&&(turkce>0))) {
            average=(muzik+kimya+matematik+fizik)/5.0f;
        }else if (!((fizik<100)&&(fizik>0))) {
            average=(turkce+kimya+matematik+muzik)/5.0f;
        }else{
            average=(turkce+kimya+matematik+muzik+fizik)/5.0f;
        }

        if (average>55.0f){
            System.out.println("Tebrikler Geçtiniz\nOrtalamanız: "+average);
        }else {
            System.out.println("Maalesef Kaldınız\nOrtalamanız: "+average);
        }
    }
}