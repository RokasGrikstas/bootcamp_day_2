import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class MasyvuPavizdys {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] mas = new int[1];
        int index = -1;
        int i = 0;
        while(index !=0) {

            System.out.println("iveskite skaiciu nuo 1 iki 10, noredami baigti iveskite 0");

            index = scanner.nextInt();



            if (index >0 && index <= 10){
                if(mas.length== i){
                    mas = Arrays.copyOf(mas, mas.length +1);
                }
                mas[i] = index;
                i++;
            }
        }
            for(Integer a :mas){
                System.out.println(a);

            }
        }
}
