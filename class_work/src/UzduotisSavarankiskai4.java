import java.util.Scanner;

public class UzduotisSavarankiskai4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("iveskite skaiciu");

        int numb = sc.nextInt();
        if (numb >= 100){
            System.out.println("skaicius yra 100 tarpe");
        }else{
            System.out.println("skaiciaus nera rezyje");

        }
    }
}
