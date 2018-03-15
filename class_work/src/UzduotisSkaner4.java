import java.util.Scanner;

public class UzduotisSkaner4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("iveskite amziu");

        int numb = sc.nextInt();
        if(numb >=18 && numb <100){
            System.out.println("Sveikinu jus galite balsuoti");
        }else if (numb <18){
            System.out.println("Subresk");
        }else if (numb >100){
            System.out.println("tu mires");
        }
    }
}
