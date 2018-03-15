import java.util.Scanner;

public class SkaitymasIsEilutes4 {
    public static void main(String[] args) {

        System.out.println(skaiciai());
    }

    private static int skaiciai() {


        Scanner sc = new Scanner(System.in);

        System.out.println("iveskite skaiciu");

        String line = sc.nextLine();

        String[] items = line.split(" ");
        int a = Integer.parseInt(items[0]);
        int b = Integer.parseInt(items[1]);
        return a+b;


    }
}
