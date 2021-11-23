import java.util.InputMismatchException;
import java.util.Scanner;

public class MethodTask {
    // 원하는 만큼 정수 계속 추가되는 배열구조 만들기
    /*
    1. 데이터 추가
    2. 데이터 삭제하기
    3. 데이터 목록보기
     */
    static String[] deleteData(int target, String[] data, int currLen){
        String[] dData = new String[currLen];
        int index = 0;
        for (int i = 0; i < data.length; i++) {
            if(i==target-1){ // n번째 이니 -1 을 해준다
                continue;
            }
            dData[index] = data[i];
            index++;
        }
        System.out.println(target+"번째 데이터 "+data[target-1]+"이 삭제되었습니다.\n");
        return dData;
    }

    static String[] addData(String dummy, String[] datas, int currLen){
        String[] dData = new String[currLen];
        for (int i = 0; i < datas.length; i++) {
            dData[i] = datas[i];
        }
        dData[currLen-1] = dummy; // 마지막 인덱스에 입력값을 추가해준다
        return dData;
    }

    static void printData(String[] datas){ // 데이터 출력
        for (int i = 0; i < datas.length; i++) {
            System.out.printf("%03d 번째 데이터 : %s\n", i+1, datas[i]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String menu = "1. 데이터 추가\n" +
                "2. 데이터 삭제하기\n" +
                "3. 데이터 목록보기\n"+
                "4. 종료하기";
        String border = "\n============================================================\n";
        String dummy =""; // 더미로 입력받은 값을 저장
        int currLen = 0; // 현재 배열의 크기
        String[] datas = new String[currLen];
        boolean isNotExit = true;
        while(isNotExit){
            int choice = 0;
            // input 예외처리
            while (true) {
                try {
                    System.out.print(menu+"\n입력: ");
                    choice = sc.nextInt();
                    break;
                } catch (InputMismatchException e) {//int 외에 다른 type이 들어왔을 경우
                    System.out.println("잘못 입력하셨습니다. 다시 입력 하세요.\n\n");
                } finally {
                    sc.nextLine();// 버퍼 비우기
                }
            }
            System.out.println(border);
            switch (choice){
                case 1:
                    currLen++; //리스트의 길이 증가
                    System.out.println("추가하실 데이터를 입력해주세요: ");
                    dummy = sc.next();
                    datas =addData(dummy, datas,currLen); // 데이터 추가 메서드
                    break;
                case 2:
                    currLen--; // 리스트의 길이 감소
                    int target =0;
                    while(true){
                        System.out.println("몇번째 데이터를 삭제하시겠습니까? : ");
                        target = sc.nextInt();
                        if (target<=currLen+1) break; // 타겟이 현재 길이보다 작다면 break
                        System.out.println("현재 배열의 크기보다 큰 수는 입력할 수 없습니다!\n");
                    }
                    datas = deleteData(target, datas, currLen); // 특정 데이터 삭제 메서드
                    break;
                case 3:
                    printData(datas);
                    System.out.println(border);
                    break;
               case 4:
                    System.out.println("종료합니다");
                    isNotExit = false; // 무한 반복 종료
                   break;
               default:
                    System.out.println("1,2,3,4 중 하나를 입력해주세요");
                    break;
            }
        }
    }
}
