import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;

public class SwitchCaseExample {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("iveskite raide nuo a-d");

        String letter = sc.nextLine();

        switch (letter){
            case "a":
                System.out.println("Gautas vardas bus Rokas");
                break;
            case "b":
                System.out.println("gautas vardas bus Jonas");
                break;
            case "c":
                System.out.println("gautas vardas bus Cicinas");
                break;
            case "d":
                System.out.println("gautas vardas bus Darius");
                break;
                default:
                    System.out.println("nepavyko rasti ivestos raides");
                 break;

        }
    }
}
