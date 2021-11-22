import java.util.Scanner;

public class ArrayTask1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //1
        System.out.println("1");
        int[] ar = new int[5];
        for (int i = 0; i < 5; i++) {
            ar[i] = i+1;
        }
        for (int i : ar) {
            System.out.print(i+" ");
        }
        //2
        System.out.println("\n2");
        int[] ar2 = new int[5];
        for (int i = 0; i < 5; i++) {
            ar2[i] = 5-i;
        }
        for (int i : ar2) {
            System.out.print(i+" ");
        }
        //3
        System.out.println("\n3");
        int[] score = new int[3];
        int sum = 0;
        for (int i = 0; i < 3; i++) {
            score[i] = sc.nextInt();
            sum+= score[i];
        }
        for (int i : score) {
            System.out.println(i);
        }
        System.out.printf("총합: %d\n",sum);

    }
}
