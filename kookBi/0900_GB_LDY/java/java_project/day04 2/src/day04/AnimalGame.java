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
		//제일 바깥쪽 while문(16번 ~ 170번)
		while(true) {
			System.out.println("플레이 하실 동물을 고르세요\n1. 강아지\n2. 고양이\n3. 돼지");
			int choice = sc.nextInt();
			
			int foodCnt = 0;
			int hp = 0;

			//고른 동물에 따라서 알맞게 설정(foodCnt, hp)
			switch(choice) {
			case 1:
				//강아지
				foodCnt = 7;
				hp = 6;
				break;
			case 2:
				//고양이
				foodCnt = 5;
				hp = 8;
				break;
			case 3:
				//돼지
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
			
			//게임 메인 while문(60번 ~ 169번 )
			while(true) {
				System.out.println(name+"님 플레이중...");
				System.out.println("1. 먹기\n2. 잠자기\n3. 산책하기\n4. 내정보 보기\n5. 나가기");
				//변수의 재사용
				//장점 : 메모리 
				//단점 : 가독성
				choice = sc.nextInt();
				//switch의 case로 break를 걸어주면 메인 while(60~)를 탈출하지 못하고
				//감싸져 있는 switch문을 탈출한다. switch문에 들어가기 전에 if문으로
				//나가기만 따로 걸러준다.
				if(choice == 5) {
					//나가기
					System.out.println("다음에 또오세요~!");
					//break를 만나는 순간 while문을 탈출하기 때문에
					//아래쪽의 switch문을 수행할 수 없다.
					//게임 메인 while문(60번 ~ 169번 ) 탈출 
					break;
				}
				//게임 선택지에 대한 스위치(78번 ~ 161번)
				switch(choice) {
				case 1:
					//먹기
					//먹이개수 검사
					if(foodCnt>0) {
						//먹을 수 있는 먹이가 있다는 뜻
						//한개 감소
						foodCnt--;
						//체력은 2 증가
						hp += 2;
						System.out.println(name+"이(가) 먹이를 먹고 체력을 회복했습니다...");
						System.out.println("현재 hp : "+hp);
					}else {
						//먹을 수 있는 먹이가 없다는 뜻
						System.out.println("먹이가 없어요.. 산책을 나가보세요..");
					}
					//스위치문 탈출(78번 ~ 161번)
					break;
				case 2:
					//잠자기
					System.out.print("쿨쿨.");
					//쿨쿨. 부터 시작해서 1초마다 . 하나씩 더 찍어가면서 3초 진행
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
					//3초가 흐른 상태
					//hp 증가
					hp++;
					System.out.println();
					System.out.println("체력 회복!\n현재 체력 : "+hp);
					//스위치문 탈출(78번 ~ 161번)
					break;
				case 3:
					//산책하기
					if(hp == 1) {
						//산책 가자마자 더 좋은곳으로 가는거 막아주기
						System.out.println("지금은 산책을 나가기에 너무 위험해요...(hp : 1)");
						//스위치문 탈출(78번 ~ 161번)
						break;
					}
					//위의 if문에 들어가지 못했다면 계속 진행이므로 hp 1 감소
					hp--;
					//랜덤 문제 출제
					Random r = new Random();
					String quiz1 = "다음 중 9시 A강의장 국비 강사의 이름은?\n1. 강동원\n2. 송강\n3. 정다솔\n4. 이정재";
					String quiz2 = "다음 중 컬렉션 프레임워크에 속하지 않는것은?\n1. ArrayList\n2. HashSet\n3. HttpServlet\n4. HashMap";
//					r.nextInt(n) : 0 ~ n-1 까지중 랜덤한 숫자
//					r.nextInt(2) : 0, 1 두개중에 랜덤한 숫자
					//랜덤한 숫자 하나 뽑아서 0이면 quiz1 출제 / 1이면 quiz2 출제
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
					//스위치문 탈출(78번 ~ 161번)
					break;
				case 4:
					//내정보 보기
					System.out.println("§ⓐⓝⓘⓜⓐⓛ★"+name+"★ⓐⓝⓘⓜⓐⓛ§");
					System.out.println("HP : "+hp);
					System.out.println("먹이 : "+foodCnt+"개\n");
					//스위치문 탈출(78번 ~ 161번)
					break;
				}
				//위의 switch문을 정상적으로 마치고 나서 hp 확인
				//산책 나갔다가 갈수도 있기 때문에
				if(hp == 0) {
					System.out.println(name+"(이)는 더이상 우리와 함께할 수 없어요...");
					//게임 메인 while문(60번 ~ 169번) 탈출
					break;
				}
			}
		}
	}
}














