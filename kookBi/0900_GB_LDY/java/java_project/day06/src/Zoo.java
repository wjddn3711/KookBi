import java.util.Scanner;

public class Zoo {
    /*
    동물 세마리 만들어서 울게하기
    이름, 나이, 성별, 종
     */
    // 먹기, 자기, 움직이기, 울기
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String type = "";
        String name = "";
        String sex = "";
        int age = 0;

        // 시작
        System.out.println("동물의 이름, 종, 나이, 성별을 입력하세요! ");
        name = sc.next();
        type = sc.next();
        age = sc.nextInt();
        sex = sc.next();
        Animal animal = new Animal(name,type,age,sex);
        int choice = 0;
        while(choice!=5){
            System.out.println("1. 먹기\n2. 자기\n3. 움직이기\n4. 울기\n5. 나가기");
            choice = sc.nextInt();
            switch (choice){
                case 1:
                    System.out.println("먹이실 먹이를 입력해주세요 : ");
                    String food = sc.next();
                    animal.eat(food);
                    break;
                case 2:
                    System.out.printf("%s 가 몇시간 동안 잠들길 원하십니가? : ",name);
                    int time = sc.nextInt();
                    animal.sleep(time);
                    break;
                case 3:
                    System.out.println("산책을 나섭니다.\n 몇 km 여정을 떠날까요?: ");
                    int dist = sc.nextInt();
                    animal.move(dist);
                    break;
                case 4:
                    animal.crying();
                    break;
                case 5:
                    System.out.println("또 오세요~");
                    break;
                default:
                    System.out.println("올바른 입력이 아닙니다");
            }
        }
    }
}
