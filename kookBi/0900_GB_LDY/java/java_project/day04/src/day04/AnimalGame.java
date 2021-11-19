package day04;

import java.util.Random;
import java.util.Scanner;

public class AnimalGame {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//타이틀 출력
		System.out.println("♬스트릿 애니멀 파이터♨ (⊙_⊙)");
		//플레이하실 동물을 고르세요
		//1. 강아지
		//2. 고양이
		//3. 돼지
		while(true) {
			System.out.println("플레이 하실 동물을 고르세요\n1. 강아지\n2. 고양이\n3. 돼지");
			int choice = sc.nextInt();
			
			int foodCnt = 0;
			int hp = 0;

			switch(choice) {
			case 1:
				foodCnt = 7;
				hp = 6;
				break;
			case 2:
				foodCnt = 5;
				hp = 8;
				break;
			case 3:
				foodCnt = 10;
				hp = 4;
				break;
			}
			
			//당신의 이름은 :
			System.out.print("당신의 이름은 : ");
			String name = sc.next();
			
			//---반복---
			//~~님 환영합니다.
			//1. 먹기
			//	먹이 1 감소 / HP 2 증가
			//2. 잠자기
			//	HP 1증가( 3초 )
			//3. 산책하기
			//	HP 1 감소
			//	랜덤한 문제 출제 *(맞추면 먹이 2개 / 틀리면 HP 1 추가감소)
			//4. 내정보 보기
			//	이름, HP, 먹이개수 등 출력
			//5. 나가기
			while(true) {
				System.out.println(name+"님 플레이중...");
				System.out.println("1. 먹기\n2. 잠자기\n3. 산책하기\n4. 내정보 보기\n5. 나가기");
				//변수의 재사용
				//장점 : 메모리 
				//단점 : 가독성
				choice = sc.nextInt();
				if(choice == 5) {
					//나가기
					System.out.println("다음에 또오세요~!");
					break;
				}
				switch(choice) {
				case 1:
					//먹기
					if(foodCnt>0) {
						foodCnt--;
						hp += 2;
						System.out.println(name+"이(가) 먹이를 먹고 체력을 회복했습니다...");
						System.out.println("현재 hp : "+hp);
					}else {
						System.out.println("먹이가 없어요.. 산책을 나가보세요..");
					}
					break;
				case 2:
					//잠자기
					System.out.print("쿨쿨.");
					for (int i = 0; i < 3; i++) {
						System.out.print(".");
						
						//Alt + Shift + Z > ↓ > Enter
						try {
//							Thread.sleep(1000) : 1000밀리초(1초) 잠시 멈추기
							Thread.sleep(1000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
					hp++;
					System.out.println();
					System.out.println("체력 회복!\n현재 체력 : "+hp);
					break;
				case 3:
					//산책하기
					if(hp == 1) {
						System.out.println("지금은 산책을 나가기에 너무 위험해요...(hp : 1)");
						break;
					}
					hp--;
					//랜덤 문제 출제
					Random r = new Random();
					String quiz1 = "다음 중 9시 A강의장 국비 강사의 이름은?\n1. 강동원\n2. 송강\n3. 정다솔\n4. 이정재";
					String quiz2 = "다음 중 컬렉션 프레임워크에 속하지 않는것은?\n1. ArrayList\n2. HashSet\n3. HttpServlet\n4. HashMap";
//					r.nextInt(n) : 0 ~ n-1 까지중 랜덤한 숫자
//					r.nextInt(2) : 0, 1 두개중에 랜덤한 숫자
					int randNum = r.nextInt(2);
					if(randNum == 0) {
						System.out.println(quiz1);
					}else if(randNum == 1) {
						System.out.println(quiz2);
					}
					int answer = sc.nextInt();
					if(answer !=3) {
						System.out.println("오답이에요...");
						hp--;
					}else {
						System.out.println("정답이에요~!");
						foodCnt+=2;
					}
					break;
				case 4:
					//내정보 보기
					System.out.println("§ⓐⓝⓘⓜⓐⓛ★"+name+"★ⓐⓝⓘⓜⓐⓛ§");
					System.out.println("HP : "+hp);
					System.out.println("먹이 : "+foodCnt+"개\n");
					break;
				}
				if(hp == 0) {
					System.out.println(name+"(이)는 더이상 우리와 함께할 수 없어요...");
					break;
				}
			}
		}
	}
}














