import java.util.Scanner;

public class ArTest {
    public static void main(String[] args) {
        int[] arData = {10,5,1,17,34};
        for (int i = 0; i < 5; i++) {
            System.out.println(arData[i]);
        }
        arData[2] = 100;

        Scanner sc = new Scanner(System.in);
        int[] arData2 = new int[5];
        for (int i = 0; i < 5; i++) {
            arData2[i] = sc.nextInt();
        }
    }
}
