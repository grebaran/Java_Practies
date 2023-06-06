import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*

    Java ile mesafeye ve şartlara göre uçak bileti fiyatı hesaplayan programı yapın.
    Kullanıcıdan Mesafe (KM), yaşı ve yolculuk tipi (Tek Yön, Gidiş-Dönüş) bilgilerini alın.
    Mesafe başına ücret 0,10 TL / km olarak alın. İlk olarak uçuşun toplam fiyatını hesaplayın ve sonrasında
     ki koşullara göre müşteriye aşağıdaki indirimleri uygulayın ;

    Kullanıcıdan alınan değerler geçerli (mesafe ve yaş değerleri pozitif sayı, yolculuk tipi ise 1 veya 2)
    olmalıdır. Aksi takdirde kullanıcıya "Hatalı Veri Girdiniz !" şeklinde bir uyarı verilmelidir.

    Kişi 12 yaşından küçükse bilet fiyatı üzerinden %50 indirim uygulanır.
    Kişi 12-24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim uygulanır.
    Kişi 65 yaşından büyük ise bilet fiyatı üzerinden %30 indirim uygulanır.
    Kişi "Yolculuk Tipini" gidiş dönüş seçmiş ise bilet fiyatı üzerinden %20 indirim uygulanır.
         */
        Scanner input=new Scanner(System.in);

        double mesafe;
        int yas;
        int yolculukTipi;
        double ucret;
        double mesafeBasinaUcret=0.10;
        System.out.print("Lütfen kaç km seyahat ettiğinizi giriniz : ");
        mesafe=input.nextFloat();
        ucret=mesafeBasinaUcret*mesafe;

        System.out.print("Lütfen yaşınızı giriniz : ");
        yas=input.nextInt();

        System.out.print("Lütfen yolculuk tipinizi giriniz (1 : Tek Yön, 2 : Gidiş-Dönüş): ");
        yolculukTipi=input.nextInt();

        if (mesafe>0 && yas>0 && (yolculukTipi==1 || yolculukTipi==2)){
            if (yas<=12){
                ucret*=0.5;
            }

            else if(yas<=24){
                ucret*=0.9;
            }

            else if((yas>=65)){
                ucret*=0.7;
            }
            if(yolculukTipi==2){
                ucret*=0.8;
                ucret*=2;
            }
            System.out.println("Ücret : "+ucret);
        }else {
            System.out.println("Hatalı Veri Girdiniz!!!");
        }


    }
}