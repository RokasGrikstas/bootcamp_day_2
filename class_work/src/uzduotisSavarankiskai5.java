public class uzduotisSavarankiskai5 {
    public static void main(String[] args) {
        System.out.println(checkIfNumberIsNegative(2));


    }

    private static boolean checkIfNumberIsNegative(int num) {
        System.out.println(num);
        boolean val = false;
        if (num < 0) {
            val = true;

        }
        return val;
    }

}
