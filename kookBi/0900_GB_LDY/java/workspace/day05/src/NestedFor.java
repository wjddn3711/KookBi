import javax.swing.plaf.synth.SynthDesktopIconUI;
import java.util.Scanner;

public class NestedFor  {
    public static void main(String[] args) {
//        for (int i = 1; i < 10; i++) {
//            System.out.printf("%d 단 출력\n",i);
//            for (int j = 1; j < 10; j++) {
//                System.out.printf("%2d * %2d = %2d\n",i,j,i*j);
//            }
//            System.out.println("\n========================================================");
//        }

        //1
//        for (int i = 0; i < 5; i++) {
//            for (int j = 0; j < 5; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//
//        //2
//        for (int i = 0; i < 5; i++) {
//            for (int j = 0; j <= i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
        //3
        Scanner sc = new Scanner(System.in);
        System.out.print("학생수: ");
        int student = sc.nextInt();
        int[] score = new int[4];
        String[] classes = {"국어","수학","영어"};
        int[] sum = new int[student];
        for (int i = 0; i < student; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("%d 번째 학생 %s 점수: ",i+1,classes[j]);
                score[i] = sc.nextInt();
                sum[i]+= score[i];
            }
        }
        double total = 0;
        for (int i = 0; i < student; i++) {
            System.out.printf("%d 번째 학생 총점: %d\n",i+1,sum[i]);
            System.out.printf("%d 번재 학생 평균: %.2f\n",i+1,sum[i]/(double)classes.length);
            total+=sum[i]/(double)classes.length;
        }
        System.out.printf("전체 평균: %.2f",total/student);

    }
}
