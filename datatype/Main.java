public class Main {
    public static void main(String[] args) {
        // Tam sayı veri tipleri
        byte byteNumber = 127; // -128 ile 127 arasında değer alır, 1 byte yer kaplar
        short shortNumber = 32000; // -32,768 ile 32,767 arasında değer alır, 2 byte yer kaplar
        int intNumber = 2147483647; // -2^31 ile 2^31-1 arasında değer alır, 4 byte yer kaplar
        long longNumber = 9223372036854775807L; // -2^63 ile 2^63-1 arasında değer alır, 8 byte yer kaplar

        // Ondalıklı veri tipleri
        float floatNumber = 3.14f; // 6-7 basamak duyarlılığı vardır, 4 byte yer kaplar
        double doubleNumber = 3.14159265359; // 15-16 basamak duyarlılığı vardır, 8 byte yer kaplar

        // Karakter ve boolean veri tipleri
        char character = 'A'; // Tek bir karakter saklar, 2 byte yer kaplar
        boolean isJavaFun = true; // true veya false değerini alır, 1 bit yer kaplar

        // Çıktı işlemleri
        System.out.println("Tam Sayı Tipleri:");
        System.out.println("byte: " + byteNumber);
        System.out.println("short: " + shortNumber);
        System.out.println("int: " + intNumber);
        System.out.println("long: " + longNumber);

        System.out.println("\nOndalıklı Sayı Tipleri:");
        System.out.println("float: " + floatNumber);
        System.out.println("double: " + doubleNumber);

        System.out.println("\nKarakter ve Boolean Tipleri:");
        System.out.println("char: " + character);
        System.out.println("boolean: " + isJavaFun);
    }
}
