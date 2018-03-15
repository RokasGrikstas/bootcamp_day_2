import java.util.Scanner;

public class UzduotisSkaner1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Iveskite skaiciu");

        int numb = sc.nextInt();
        if (numb > 100){
            System.out.println("Skaicius yra didesnis uz 100");
        }else{
            System.out.println("skaicius yra mazesnis uz 100 ");

        }
    }
}
