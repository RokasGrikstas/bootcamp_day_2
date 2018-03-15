import java.util.Scanner;

public class UzduotisMasivai {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Iveskite masyvo ilgi");
        int masSize = sc.nextInt();

        int[] mas = new int[masSize];

        for(int i = 0; i < mas.length; i++){
            System.out.println("Iveskite " + i + "elementa");
            mas[i] = sc.nextInt();
        }

        int sum = 0;
        int sandauga = 1;
        double vidurkis = 0;

        for(int i = 0; i < mas.length; i++){
            System.out.print(mas[i] + " ");

            sum += mas[i];
            sandauga *= mas[i];
        }
        vidurkis = sum / mas.length;
        System.out.println("\nsuma =" + sum);
        System.out.println("sandauga = " + sandauga);
        System.out.println("vidurkis =" + vidurkis);
    }
}
