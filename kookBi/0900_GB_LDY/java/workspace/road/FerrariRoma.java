package road;

public class FerrariRoma extends Car implements Ferrari{

	@Override
	public void engineStart() {
		System.out.println(brand+" ��ġ�� �õ� �ѱ�");
	}

	@Override
	public void engineStop() {
		System.out.println(brand+" ��ġ�� �õ� ����");		
	}
	
}
