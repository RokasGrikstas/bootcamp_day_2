import java.util.Scanner;

public class SwichUzduotis1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("iveskite skaiciu nuo 1 iki 5");

        String sk = sc.nextLine();

        switch (sk){
            case "1":
                System.out.println("ivestas zinomas skaicius: 1");
                break;
            case "2":
                System.out.println("ivestas zinomas skaicius: 2");
                break;
            case "3":
                System.out.println("ivestas zinomas skaicius: 3");
                break;
            case "4":
                System.out.println("ivestas zinomas skaicius: 4");
                break;
            case "5":
                System.out.println("ivestas zinomas skaicius: 5");
                break;
                default:
                    System.out.println("ivestas nezinomas skaicius");


        }
    }


}
