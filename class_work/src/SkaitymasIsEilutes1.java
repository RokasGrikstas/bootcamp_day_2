import java.util.Scanner;

public class SkaitymasIsEilutes1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("iveskite skaiciu");

        String line=sc.nextLine();

        String[] items = line.split(" ");
        int a = Integer.parseInt(items[0]);
        int b = Integer.parseInt(items [1]);

        System.out.println(a+b);
    }
}
