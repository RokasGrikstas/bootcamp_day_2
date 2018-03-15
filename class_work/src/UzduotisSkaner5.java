import java.util.Scanner;

public class UzduotisSkaner5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("iveskite skaiciu");

        int numb = sc.nextInt();
        if(numb <0){
            System.out.println("neigiamas");
        }else if (numb >= 100){
            System.out.println("didesnis negu simtas");
        }else {
            System.out.println("nera varianto");
        }
    }
}
