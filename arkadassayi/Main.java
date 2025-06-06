public class Main {
    public static void main(String[] args) {

        int number1 = 220, number2 = 284; // Kontrol etmek istediğimiz iki sayı
        int i, sum1 = 0, sum2 = 0; // Bölenler toplamları için değişkenler

        // İlk sayının (number1) bölenlerinin toplamını buluyoruz
        for (i = 1; i <= number1 / 2; i++) { // number1'in yarısına kadar bakıyoruz çünkü daha büyük bölen olmaz
            if (number1 % i == 0) { // Eğer i, number1'i tam bölüyorsa
                sum1 += i; // Toplama ekliyoruz
            }
        }

        // İkinci sayının (number2) bölenlerinin toplamını buluyoruz
        for (i = 1; i <= number2 / 2; i++) { // Aynı şekilde number2'nin yarısına kadar gidiyoruz
            if (number2 % i == 0) { // Tam bölen mi?
                sum2 += i; // Topla
            }
        }

        // Şimdi arkadaş sayı mı diye kontrol ediyoruz
        if (number1 == sum2 && number2 == sum1) {
            System.out.println("girilen sayılar arkadaş"); // Eğer şart sağlanıyorsa yaz
        } else {
            System.out.println("girilen sayılar arkadaş değil"); // Sağlanmıyorsa bu
        }
    }
}

