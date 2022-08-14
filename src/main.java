import java.util.Scanner;

public class main {
    public static void main(String[] args) {




        //Değişkenler
        int matematik, fizik, kimya, turkce, tarih, muzik;

        //Scanner Sınıfı
        Scanner sc = new Scanner(System.in);

        //Kullanıcıdan Veri Alma
        System.out.print("Matematik Notunuzu Giriniz : ");
        matematik = sc.nextInt();

        System.out.print("Fizik Notunuzu Giriniz : ");
        fizik = sc.nextInt();

        System.out.print("Kimya Notunuzu Giriniz : ");
        kimya = sc.nextInt();

        System.out.print("Turkce Notunuzu Giriniz : ");
        turkce = sc.nextInt();

        System.out.print("Tarih Notunuzu Giriniz : ");
        tarih = sc.nextInt();

        System.out.print("Muzik Notunuzu Giriniz : ");
        muzik = sc.nextInt();

        //Girilen Notların Ortalamasını
        int toplam = matematik + fizik + kimya + turkce + tarih + muzik;
        double sonuc = toplam / 6;

        //Not Ortalaması
        System.out.println("Ortalamaniz : "+sonuc);

        //Sınıf Geçişi?
        boolean sart = sonuc >= 60;
        String sınıf = sart ? "Sinif Gecildi" : "Sinifta Kalindi";
        System.out.println(sınıf);

        boolean saka = sonuc==100;
        String sınıf2 = saka ? "Buyuk bir is basardin ve bunun icin seni sadece bilgisayar kutluyor" : "SandiGin kadar iyi deGilsin senden daha iyileri de var ornegin benim 2. ssinif ortalamam 100'dU";
        System.out.println(sınıf2);
    }

}