package view;

import java.util.Scanner;

import controller.Calc;
import model.Datas;

public class InputView {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Calc calc = new Calc();
		System.out.print("첫번째 정수 : ");
		int num1 = sc.nextInt();
		System.out.print("두번째 정수 : ");
		int num2 = sc.nextInt();
		System.out.print("수행할 연산 : ");
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



