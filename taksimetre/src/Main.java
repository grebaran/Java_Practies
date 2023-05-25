import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        float acilisUcreti=10.0f;
        float kmBasina=2.2f;

        System.out.print("Kaç Km yol gidildi : ");
        float yol=input.nextFloat();

        float result=((yol*kmBasina)+acilisUcreti)>20.0?(yol*kmBasina)+acilisUcreti:20.0f;
        System.out.print("Ücret : "+result);

    }
}