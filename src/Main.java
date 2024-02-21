import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        //Kullanıcı veri girişi
        System.out.println("Sayı giriniz: ");
        int a = inp.nextInt();

        //Ters üçgen döngüsü
        for (int i = 1; i <= a; i++) {
            for (int b = 1; b < i; b++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}