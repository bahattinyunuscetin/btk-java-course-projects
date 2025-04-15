public class Main {
    public static void main(String[] args) {
        Ogrenci ogr1 = new Ogrenci();
        Ogrenci ogr2 = new Ogrenci("Ayşe");
        Ogrenci ogr3 = new Ogrenci("Mehmet", 22);

        ogr1.bilgileriYazdir();
        ogr2.bilgileriYazdir();
        ogr3.bilgileriYazdir();

        ogr3.selamla();
        ogr3.selamla("Selam!");
        ogr3.selamla("Merhaba!", 3);
    }
}
