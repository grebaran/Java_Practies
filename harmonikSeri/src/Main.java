import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Java ile girilen sayının harmonik serisini bulan program yazacağız.
         */
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen harmonik serisi bulanacak sayıyı giriniz : ");
        int number=input.nextInt();

        double results=0.0;

        for (double i=1.0;i<=number;i++){
            results+= 1.0 /i;
        }
        System.out.println(number+" sayısının harmonik serisi : "+results);

    }
}