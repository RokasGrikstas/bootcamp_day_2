import java.util.Scanner;

public class UzduotisSavarankiskai3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Iveskite skaiciu");

        int numb = sc.nextInt();
        if (numb > 100) {
            System.out.println(numb);
        } else {
            System.out.println("bandykite dar karta");

        }
    }
}
