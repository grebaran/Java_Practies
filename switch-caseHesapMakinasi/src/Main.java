import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n1, n2, select;

        Scanner input=new Scanner(System.in);
        System.out.print("Lütfen 1.sayıyı giriniz: ");
        n1=input.nextInt();

        System.out.print("Lütfen 2.sayıyı giriniz: ");
        n2=input.nextInt();

        System.out.println("İşlemler:\nToplama : 1\nÇıkarma : 2\nÇarpma : 3\nBölme : 4");
        System.out.print("Yapacağınız İşlemi Giriniz : ");
        select=input.nextInt();

        switch (select){
            case 1:
                System.out.println(n1+n2);
                break;
            case 2:
                System.out.println(n1-n2);
                break;
            case 3:
                System.out.println(n1*n2);
                break;
            case 4:
                System.out.println(n1/n2);
                break;
            default:
                System.out.println("Yanlış bir işlem girdiniz ! ");
        }
    }
}