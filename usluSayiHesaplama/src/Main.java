import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Ödev
        Java ile kullanıcının girdiği değerler ile üslü sayı hesaplayan programı "For Döngüsü" kullanarak yapınız.
         */
        Scanner input=new Scanner(System.in);
        System.out.print("Taban değer : ");
        int taban=input.nextInt();

        System.out.print("Üst değer : ");
        int ust=input.nextInt();

        double results=1;

        if (taban!=0&&ust!=0){
            if (ust>0){
                for(int i=1;i<=ust;i++){
                    results*=taban;
                }
                System.out.println(taban+" üssü "+ust+" = "+results);
            } else{
                ust*=-1;
                for(int i=1;i<=ust;i++){
                    results*=taban;
                }
                results=(double) 1/results;
                System.out.println(taban+" üssü "+-1*ust+" = "+results);
            }



        } else if (taban==0&&ust==0) {
            System.out.print("Cevaplanamayan işlem");
        } else if (taban==0) {
            System.out.println(taban+" üssü "+ust+" = "+0);
        } else if (taban==1&&ust==0) {
            System.out.println(taban+" üssü "+ust+" = "+1);
        }


    }
}