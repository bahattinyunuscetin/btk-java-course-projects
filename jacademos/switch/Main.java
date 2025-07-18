//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    char grade = 'A';

    switch (grade){
        case 'A':
            System.out.println("mükemmel : Geçtiniz");
            break;
        case 'B':
            System.out.println("çok güzel : Geçtiniz");
            break;
        case 'C':
            System.out.println("iyi : Geçtiniz");
            break;
        case 'D':
            System.out.println("Fena Değil : Geçtiniz");
            break;
        case 'F':
            System.out.println("maalesef kaldınız");
            break;
        default:
            System.out.println("geçersiz not girdiniz");

    }
    }
}