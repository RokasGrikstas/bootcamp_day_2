import java.util.Scanner;

public class UzduotisSavarankiskai7 {

    public static void main(String[] args) {
        int sk = 60;
        int r1 = 100;
        int r2 = 50;

        System.out.println(testMethod(sk, r1, r2));
    }

    private static boolean testMethod (int sk, int r1, int r2) {
        boolean val = false;
        if(r1 < r2){
            System.out.println("r1 < r2");
        } else {
            if(sk <= r1 && sk >= r2){
                System.out.println("sk yra tarp reziu");
                val = true;
            }else {
                System.out.println("nera tarp reziu");
            }
        }

        return val;
    }


}
