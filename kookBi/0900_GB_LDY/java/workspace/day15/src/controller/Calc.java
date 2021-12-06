package controller;

import model.Datas;

public class Calc {
	public String doing(Datas model) {
		String result = null;
		String oper = model.oper;
		int num1 = model.num1;
		int num2 = model.num2;
		switch(oper) {
		case "+":
			result = num1+num2+"";
			break;
		case "-":
			result = num1-num2+"";
			break;
		case "*":
			result = num1*num2+"";
			break;
		case "/":
			result = num1/num2+"";
			break;
		}
		return result;
	}
}
