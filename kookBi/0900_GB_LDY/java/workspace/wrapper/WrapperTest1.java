package wrapper;

public class WrapperTest1 {
	public static void main(String[] args) {
		int data = 10;
		
//		�ڽ�
		//������
//		Integer obj = new Integer(data);
		//�Ź���
		Integer obj = (Integer)data;
		
//		��ڽ�
		int data2 = obj.intValue();
		
//		���� �ڽ�
		obj = 20;		//obj = (Integer)20;
		data2 = obj;	//data2 = obj.intValue();
		
	}
}












