import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Ödev

        N elemanlı bir kümenin elemanları ile oluşturulacak r elemanlı farklı grupların sayısı n’in r’li kombinasyonu
        olarak adlandırılır. N’in r’li kombinasyonu C(n,r) şeklinde gösterilir.

        Java ile kombinasyon hesaplayan program yazınız.

        Kombinasyon formülü
        C(n,r) = n! / (r! * (n-r)!)
         */

        Scanner input=new Scanner(System.in);
        System.out.print("Lütfen kombinasyon için ilk değeri giriniz : ");
        int number1=input.nextInt();
        int n=1;
        System.out.print("Lütfen kombinasyon için ikinci değeri giriniz : ");
        int number2=input.nextInt();
        int r=1;

        int nr=1;

        for(int i=1;i<=number1;i++){
            n*=i;
        }
        for(int i=1;i<=number2;i++){
            r*=i;
        }
        for(int i=1;i<=number1-number2;i++){
            nr*=i;
        }

        int result=n/(r*nr);
        System.out.print("C("+number1+","+number2+")"+" = "+result);




    }
}