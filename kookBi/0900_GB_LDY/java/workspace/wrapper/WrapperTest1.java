package wrapper;

public class WrapperTest1 {
	public static void main(String[] args) {
		int data = 10;
		
//		冠教
		//备巩过
//		Integer obj = new Integer(data);
		//脚巩过
		Integer obj = (Integer)data;
		
//		攫冠教
		int data2 = obj.intValue();
		
//		坷配 冠教
		obj = 20;		//obj = (Integer)20;
		data2 = obj;	//data2 = obj.intValue();
		
	}
}












