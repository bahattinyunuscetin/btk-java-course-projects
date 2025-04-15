// Bu sınıf public DEĞİL çünkü Main.java dosyasını çalıştıracağız
class Ogrenci {
    // ----------------- ALANLAR (FIELDS) ------------------
    // Sınıfa ait veriler: her öğrencinin ismi ve yaşı olacak
    String isim;
    int yas;

    // ----------------- CONSTRUCTOR'LAR ------------------

    // 1. Parametresiz constructor (Yapıcı metot)
    // Nesne oluşturulunca çalışır ve varsayılan değerler atar
    public Ogrenci() {
        this.isim = "Bilinmiyor";
        this.yas = 0;
    }

    // 2. Tek parametreli constructor
    // Sadece isim veriyoruz, yaş otomatik atanıyor
    public Ogrenci(String isim) {
        this.isim = isim;
        this.yas = 18; // Varsayılan yaş
    }

    // 3. İki parametreli constructor
    // Hem isim hem yaş veriyoruz
    public Ogrenci(String isim, int yas) {
        this.isim = isim;
        this.yas = yas;
    }

    // ----------------- METHOD OVERLOADING (AŞIRI YÜKLEME) ------------------

    // Aynı isimde 3 farklı metot: selamla()
    // 1. Parametresiz metot
    public void selamla() {
        System.out.println("Merhaba, ben " + isim);
    }

    // 2. Tek parametreli metot
    public void selamla(String mesaj) {
        System.out.println(mesaj + " Benim adım " + isim);
    }

    // 3. İki parametreli metot
    public void selamla(String mesaj, int tekrar) {
        for (int i = 0; i < tekrar; i++) {
            System.out.println(mesaj + " Benim adım " + isim);
        }
    }

    // Öğrencinin bilgilerini ekrana yazdıran metot
    public void bilgileriYazdir() {
        System.out.println("İsim: " + isim);
        System.out.println("Yaş: " + yas);
    }
}
