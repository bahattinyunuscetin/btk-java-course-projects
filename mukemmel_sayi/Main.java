//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Mükemmel sayı: Kendisinden başka pozitif tam bölenleri toplamı kendisine eşit olan sayıdır.
        // Örneğin: 6 --> 1 + 2 + 3 = 6 (Mükemmel sayı)
        // Örneğin: 28 --> 1 + 2 + 4 + 7 + 14 = 28 (Mükemmel sayı)

        int number = 28; // Kontrol etmek istediğimiz sayı (Bunu istediğin gibi değiştirebilirsin)
        int toplam = 0;  // Bölenlerin toplamını tutacak değişken
        int i;           // Döngü sayacı

        // Sayının yarısına kadar olan bölenleri kontrol ediyoruz
        // Çünkü hiçbir sayı, kendisinden büyük olan sayıya tam bölünemez
        for (i = 1; i <= number / 2; i++) { // i <= number/2: Sayının yarısına kadar
            if (number % i == 0) {          // Eğer i sayıya tam bölünüyorsa
                toplam += i;               // Bölenleri toplama ekle
                System.out.println(i + " sayısı " + number + " sayısına tam bölünür."); // Bilgilendirme
            }
        }

        // Bölenler toplamı sayının kendisine eşitse mükemmel sayıdır
        if (toplam == number) {
            System.out.println(number + " mükemmel sayıdır.");
        } else {
            System.out.println(number + " mükemmel sayı değildir.");
        }
    }
}
