import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*Eğer şifre yanlış ise kullanıcıya şifresini sıfırlayıp sıfırlamayacağını sorun,
         eğer kullanıcı sıfırlamak isterse yeni girdiği şifrenin hatalı girdiği ve unuttuğu şifre ile
         aynı olmaması gerektiğini kontrol edip , şifreler aynı ise ekrana "Şifre oluşturulamadı, lütfen
         başka şifre giriniz." sorun yoksa "Şifre oluşturuldu" yazan programı yazınız.*/

        String realusername="grebaran" , realpassword="1234";
        String username,password;
        Scanner input=new Scanner(System.in);

        System.out.print("Lütfen kullanıcı adınızı giriniz : ");
        username=input.nextLine();

        System.out.print("Lütfen şifrenizi giriniz : ");
        password=input.nextLine();

        if ((username.equals(realusername))&&(password.equals(realpassword))){
            System.out.println("Başarılı bir şekilde giriş yaptınız.");
        }else{
            System.out.println("Şifreniz yanlış!");
            System.out.println("Şifrenizi sıfırlamak ister misiniz? (e: evet \\ h: hayır)");
            String kontroldurumu=input.nextLine();
            if (kontroldurumu.equals("e")){
                System.out.print("Lütfen yeni şifrenizi giriniz: ");
                String newpassword=input.nextLine();
                if(!(newpassword.equals(realpassword))){
                    realpassword=newpassword;
                    System.out.println("Şifre oluşturuldu.");
                }else{
                    System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                }
            }
        }

    }
}