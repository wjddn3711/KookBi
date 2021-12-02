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
		//obj �Ű������� Object Ÿ������ �ۿ��� �Ѱ��� ��ü���� ��ĳ���� �ؼ� �޴´�.
		//���� ������ �ʵ���� ���� ���Ϸ��� ��ĳ���� �Ǹ� �߷������� �ʵ带 �ٽ�
		//�ٿ�ĳ�������� �ٿ��� �� �ٿ��� ��ü�� �񱳸� �ؾ��Ѵ�. �ٿ�ĳ������ Test Ÿ����
		//��ü�� ��ĳ���� �Ǿ��� ���� �ؾ��ϹǷ� instanceof�� Ÿ�� �񱳺��� ���ش�.
//		1. Ÿ�Ժ�
		if(obj instanceof Test) {
//			2. �ٿ�ĳ����
			Test target = (Test)obj;
		
//			3. ���Ǻ�
			if(this.intData == target.intData) {
				if(this.doubleData == target.doubleData) {
					return true;
				}
			}
		}
//		TestŸ���� �ƴ� ��ü�� ���߰ų�, ���ǿ� ���� �ʴ� Test��ü��� ���� �κ�
		return false;
	}
	@Override
	public int hashCode() {
//		10, 11.11
//		10, 11.12
		return intData+(int)doubleData*2;
	}
}


















