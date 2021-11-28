package bms;

import java.util.Random;

public class BankManager {
	static Bank[][] arUser = new Bank[3][1000];
	static int[] arCnt = {0,0,0};
	
	String join(int bankChoice, String name, String pw) {
		
		Random r = new Random();
		//10000~99999
		//0~89999 + 10000
		String account = r.nextInt(90000)+10000+"";
		
//		�ߺ�üũ
		for (int i = 0; i < arUser.length; i++) {
			for (int j = 0; j < arCnt[i]; j++) {
				if(arUser[i][j].account.equals(account)) {
					account = r.nextInt(90000)+10000+"";
					i = -1;
					break;
				}
			}
		}
		
//		�ߺ�üũ ���
		
//		Bank[] makers = {
//				new Kookmin(account, pw, name),
//				new Shinhan(account, pw, name),
//				new Woori(account, pw, name)
//		};
//		arUser[bankChoice-1][arCnt[bankChoice-1]] = makers[bankChoice-1];
//		arCnt[bankChoice-1]++;
		
		if(bankChoice == 1) {
			//��������
			arUser[0][arCnt[0]] = new Kookmin(account, pw, name);
			arCnt[0]++;
		}
		else if(bankChoice == 2) {
			//��������
			arUser[1][arCnt[1]] = new Shinhan(account, pw, name);
			arCnt[1]++;
		}
		else if(bankChoice == 3) {
			//�츮����
			arUser[2][arCnt[2]] = new Woori(account, pw, name);
			arCnt[2]++;
		}
		
		return account;
	}
	Bank login(String account,String pw) {
		for (int i = 0; i < arCnt.length; i++) {
			for (int j = 0; j < arCnt[i]; j++) {
				if(arUser[i][j].account.equals(account)) {
					if(arUser[i][j].pw.equals(pw)) {
						//�α��� ����
						return arUser[i][j];
					}
				}
			}
		}
		return null;
	}
}





