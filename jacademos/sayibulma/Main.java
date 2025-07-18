// Bu program, verilen bir sayının bir dizi içinde olup olmadığını kontrol eder.

public class Main {
    public static void main(String[] args) {
        // sayilar dizisi oluşturuluyor ve içinde 1'den 7'ye kadar olan sayılar yer alıyor.
        int[] sayilar = new int[]{1, 2, 3, 4, 5, 6, 7};

        // aranacak sayıyı belirliyoruz. Bu örnekte 5.
        int aranacak = 5;

        // sayının dizide olup olmadığını takip etmek için boolean bir değişken tanımlıyoruz.
        boolean varmi = false;

        // sayilar dizisini döngü ile kontrol ediyoruz.
        for (int sayi : sayilar) {
            // Eğer dizideki bir sayı aranacak sayıya eşitse, 'varmi' değişkenini true yapıyoruz ve döngüden çıkıyoruz.
            if (sayi == aranacak) {
                varmi = true;
                break;
            }
        }

        // Eğer varmi değişkeni true olduysa, sayının dizide mevcut olduğunu yazdırıyoruz.
        if (varmi) {
            System.out.println("sayı mevcuttur");
        } else {
            // Eğer varmi false kalmışsa, sayının dizide mevcut olmadığını yazdırıyoruz.
            System.out.println("sayı mevcut değil");
        }
    }
}
