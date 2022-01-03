import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        double  tutar,kdvTutar,kdvOran = 0.18 ,kdvliTutar;
        Scanner input = new Scanner(System.in);
        System.out.println("Ücret Tutarını Giriniz : ");
        tutar = input.nextDouble();

        kdvTutar = tutar * kdvOran;
        kdvliTutar = tutar + kdvTutar;

        String sonuc = ( tutar < 1000) ?  "%18" : "%8";
        System.out.println("sonuc : " + sonuc );

        System.out.println("Kdvsiz tutar:" + tutar);
        System.out.println("Kdv oranı: "+ kdvOran);
        System.out.println("Kdv tutarı: "+ kdvTutar) ;
        System.out.println("Kdvli tutar: " + kdvliTutar);


    }

}
