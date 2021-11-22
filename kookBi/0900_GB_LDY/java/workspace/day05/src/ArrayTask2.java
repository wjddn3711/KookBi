import java.util.Scanner;

public class ArrayTask2 {
    public static void main(String[] args) {
        // 4층 : 5호
        // 입력되는 101호 : 100
        // 102호: xxx....
        Scanner sc = new Scanner(System.in);
        int[][] hotel = new int[4][5];
        int[] floorSum = new int[4];
        int[] hoSum = new int[5];
        System.out.println("=================각 호수별 월세 입력받기=================");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.printf("%d0%d호 : ",i+1,j+1);
                hotel[i][j] = sc.nextInt(); //월세 입력
                floorSum[i] += hotel[i][j];
                hoSum[j] += hotel[i][j];
            }
        }
        int total = 0; // 총 월세
        System.out.println("================= 층별 총 월세 =================");
        for (int i = 0; i < floorSum.length; i++) {
            System.out.printf("%d층 총 월세: %d\n",i+1,floorSum[i]);
            total+=floorSum[i];
        }
        System.out.printf("층별 월세 평균: %.2f\n",(double)total/4);
        System.out.println("================= 호수별 총 월세 =================");
        for (int i = 0; i < hoSum.length; i++) {
            System.out.printf("%d호 총 월세: %d\n",i+1,hoSum[i]);
        }
        System.out.printf("호수별 월세 평균: %.2f\n",(double)total/5);
        System.out.println("=================평균 월세 보다 높은 호수=================");
        double avg = total / (double)20;
        System.out.printf("평균 월세는 %.2f이며\n",avg);
        String upper = "";
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                if (hotel[i][j] > avg){
                    upper+=String.format("%d0%d호(%d만원) , ",i+1,j+1,hotel[i][j]);
                }
            }
        }
        upper = upper.substring(0,upper.length()-2);
        System.out.println(upper+"는 평균보다 높은 월세입니다.");
        // 출력 1층 총 월세:... 4층 총 월세
        // 1호 총 월세 :... 5호 총 월세\
        System.out.println("\n현재 아파트 월세 분포도");
        for (int i = 3; i >= 0; i--) {
            for (int j = 0; j < 5; j++) {
                System.out.printf("  %d0%d[%4d]  |",i+1,j+1,hotel[i][j]);
            }
            System.out.printf("%5d",floorSum[i]);
            System.out.println();
        }
    }
}
