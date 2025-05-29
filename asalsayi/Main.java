//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int number = 25;

        boolean isprime = true;

        for (int i = 2; i <= number / 2; i++) {
            if(number % i == 0){
                isprime = false;
                break;
            }
        }
        if(isprime){
            System.out.println("sayı asaldır");
        }else {
            System.out.println("sayı asal değildir");
        }
    }
}