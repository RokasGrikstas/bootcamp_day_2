import java.util.Scanner;

public class UzduotisSavarankiskai6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Iveskite skaiciu");

        int numb = sc.nextInt();

        if (numb >=100 && numb < 1000){
            System.out.println("skaicius yra trizenklis");
        }else {
            System.out.println("skaicius nera trizenklis");


        }

        }
    }

