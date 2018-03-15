import java.util.InputMismatchException;
import java.util.Scanner;

public class SwichUzduotis3 {

    public static void main(String[] args) {

        System.out.println("1 - suma \n2 - Skirtumas\n3 - sandauga\n");

        Scanner sc = new Scanner(System.in);
        System.out.println("");
        int inputas = gautiGeraSkaiciu(sc);



        switch (inputas) {
            case 1:
                suma(sc);
                break;
            case 2:
                System.out.println("skirtumas =" + skirtumas(sc));
                break;
            case 3:
                System.out.println("sandauga =" + sandauga(sc));
                break;
            default:
                System.out.println("nesamone");
                break;


        }

    }

    private static int gautiGeraSkaiciu(Scanner sk) {

        int a;
        while (true) {
            try {
                a = sk.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("man rodos tai ne skaicius bandyk vel: ");
                sk.nextLine();

            }

        }
        return a;
    }

    private static void suma (Scanner sc){
        System.out.println("iveiskite pirma skaiciu");
        int a = gautiGeraSkaiciu(sc);

        System.out.println("iveksite antra skaiciu");
        int b = gautiGeraSkaiciu(sc);

        System.out.println("suma yra =" + (a + b));

    }

    private static int skirtumas(Scanner sc){
        System.out.println("iveskite pirma skaiciu");
        int a = gautiGeraSkaiciu(sc);

        System.out.println("iveskite antra skaiciu");
        int b = gautiGeraSkaiciu(sc);
        return a-b;

    }

    private static int sandauga (Scanner sc){
        System.out.println("iveskite pirma skaiciu");
        int a = gautiGeraSkaiciu(sc);

        System.out.println("iveskite antra skaiciu");
        int b = gautiGeraSkaiciu(sc);
        return a*b;
    }
}
