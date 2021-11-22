import java.util.Scanner;

public class ArrayTask1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //1
//        System.out.println("1");
//        int[] ar = new int[5];
//        for (int i = 0; i < 5; i++) {
//            ar[i] = i+1;
//        }
//        for (int i : ar) {
//            System.out.print(i+" ");
//        }
//        //2
//        System.out.println("\n2");
//        int[] ar2 = new int[5];
//        for (int i = 0; i < 5; i++) {
//            ar2[i] = 5-i;
//        }
//        for (int i : ar2) {
//            System.out.print(i+" ");
//        }
//        //3
//        System.out.println("\n3");
//        int[] score = new int[3];
//        int sum = 0;
//        for (int i = 0; i < 3; i++) {
//            score[i] = sc.nextInt();
//            sum+= score[i];
//        }
//        for (int i : score) {
//            System.out.println(i);
//        }
//        System.out.printf("총합: %d\n",sum);
        String[] classes = {"국어","수학","영어","자바","DBMS"};
        int[] score = new int[classes.length];
        int sum = 0;
        for (int i = 0; i < classes.length; i++) {
            System.out.printf("%s점수 : ",classes[i]);
            score[i] = sc.nextInt();
            sum += score[i];
        }
        double avg = sum/classes.length;
        System.out.printf("총점: %d\n",sum);
        System.out.printf("평균: %.1f",avg);
    }
}
