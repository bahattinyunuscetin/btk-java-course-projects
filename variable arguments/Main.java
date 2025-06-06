public class Main {

    // Bu metot, herhangi bir sayıda int parametresi alabilir.
    public static void topla(int... sayilar) {
        // Sayıların toplamını tutacak değişken
        int toplam = 0;

        // Gelen parametreleri döngü ile topluyoruz
        for (int sayi : sayilar) {
            toplam += sayi;
        }

        // Sonucu ekrana yazdırıyoruz
        System.out.println("Toplam: " + toplam);
    }

    public static void main(String[] args) {
        // Farklı sayıda parametre ile metodu çağırıyoruz

        topla(1, 2, 3); // 1 + 2 + 3 = 6
        topla(5, 10, 15, 20); // 5 + 10 + 15 + 20 = 50
        topla(7); // 7
        topla(); // Hiç parametre vermeden çağırdık, toplam = 0
    }
}
