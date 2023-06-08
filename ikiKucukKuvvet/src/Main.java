import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Java döngüler ile girilen sayıya kadar olan 4 ve 5'in kuvvetlerini ekrana yazdıran programı yazıyoruz.
         */
        int control1=4;
        int control1_statement=4;
        int control2=5;
        int control2_statement=5;

        Scanner input=new Scanner(System.in);
        System.out.print("Lütfen bir değer giriniz : ");
        int number=input.nextInt();

        for (int i=0;i<=number;i+=1){
            if (i==control1){
                System.out.print(control1+",");
                control1*=control1_statement;

            }if (i ==control2) {
                System.out.print(control2+",");
                control2*=control2_statement;

            }
        }
    }
}