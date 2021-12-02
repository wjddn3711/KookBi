package obj;

public class Test {
	int intData;
	double doubleData;
	
	public Test(int intData, double doubleData) {
		this.intData = intData;
		this.doubleData = doubleData;
	}
	
	@Override
	public String toString() {
		//intData : 10 / doubleData : 11.11
		return "intData : "+intData+" / doubleData : "+doubleData;
	}
	
	@Override
	public boolean equals(Object obj) {
		//obj 매개변수는 Object 타입으로 밖에서 넘겨준 객체들을 업캐스팅 해서 받는다.
		//따라서 내부의 필드들을 서로 비교하려면 업캐스팅 되며 잘려나갔던 필드를 다시
		//다운캐스팅으로 붙여준 후 붙여진 객체로 비교를 해야한다. 다운캐스팅은 Test 타입의
		//객체가 업캐스팅 되었을 때만 해야하므로 instanceof로 타입 비교부터 해준다.
//		1. 타입비교
		if(obj instanceof Test) {
//			2. 다운캐스팅
			Test target = (Test)obj;
		
//			3. 조건비교
			if(this.intData == target.intData) {
				if(this.doubleData == target.doubleData) {
					return true;
				}
			}
		}
//		Test타입이 아닌 객체를 비교했거나, 조건에 맞지 않는 Test객체라면 오는 부분
		return false;
	}
	@Override
	public int hashCode() {
//		10, 11.11
//		10, 11.12
		return intData+(int)doubleData*2;
	}
}


















