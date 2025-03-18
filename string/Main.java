//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String mesaj = "bugün hava çok güzel.";
        System.out.println(mesaj);
//
//        System.out.println("eleman sayısı : " + mesaj.length());
//        System.out.println("5. eleman : " + mesaj.charAt(4));
//        System.out.println(mesaj.concat(" yaşasın!"));
//        System.out.println(mesaj.startsWith("b"));
//        System.out.println(mesaj.endsWith("."));
//        char[] karakterler = new char[5];
//        mesaj.getChars(0, 5, karakterler, 0);
//        System.out.println(karakterler);
//        System.out.println(mesaj.indexOf("av"));
//        System.out.println(mesaj.lastIndexOf("a"));

    String yenimesaj=mesaj.replace(' ','-');
    System.out.println(yenimesaj);
    System.out.println(mesaj.substring(2,5));

    for(String kelime : mesaj.split(" ")){
        System.out.println(kelime);
    }
     System.out.println(mesaj.trim());  // boşlukları kaldırıyor


    }
}