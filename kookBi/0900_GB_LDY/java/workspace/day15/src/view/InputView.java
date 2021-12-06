package view;

import java.util.Scanner;

import controller.Calc;
import model.Datas;

public class InputView {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Calc calc = new Calc();
		System.out.print("ù��° ���� : ");
		int num1 = sc.nextInt();
		System.out.print("�ι�° ���� : ");
		int num2 = sc.nextInt();
		System.out.print("������ ���� : ");
		String oper = sc.next();
		
		Datas model = new Datas(num1,num2,oper);
		
		String result = calc.doing(model);
		
		if(result == null) {
			new ExceptionView();
		}
		else {
			new OutputView(result);
		}
		
		
	}
}



