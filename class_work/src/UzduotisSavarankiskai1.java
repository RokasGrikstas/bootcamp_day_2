import java.util.Scanner;

public class UzduotisSavarankiskai1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Iveskite skaiciu");

        int numb = sc.nextInt();
         if (numb > 100){
             System.out.println("skaicius netinkamas");
         }else{
             System.out.println("skaicius tinkamas");

         }



    }
}
