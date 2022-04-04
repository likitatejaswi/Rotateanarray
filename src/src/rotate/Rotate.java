package rotate;

import java.util.Scanner;

public class Rotate {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("ENTER ELEMENTS");
        int[] array = new int[3];
        array[0] = s.nextInt();
        array[1] = s.nextInt();
        array[2] = s.nextInt();

        System.out.printf("Entered elements [%d,%d,%d] %n",array[0],array[1],array[2]);

        Ex79 ex = new Ex79();
        int[] finalresult = ex.rotate(array);
        System.out.printf("Final result [%d,%d,%d] %n ",array[1],array[2],array[0]);

    }
}
