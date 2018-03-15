import java.util.Scanner;

public class SwichUzduotis {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("iveskite skaiciu 1-2");

        String sk = sc.nextLine();



        switch (sk){
            case "1":
                System.out.println("skaicius bus 100");
                break;
            case "2":
                System.out.println("skaicius bus 200");
                break;
                default:
                    System.out.println("nepavyko rasti skaiciaus");
                break;


        }

    }
}
