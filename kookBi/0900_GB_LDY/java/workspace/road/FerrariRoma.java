package road;

public class FerrariRoma extends Car implements Ferrari{

	@Override
	public void engineStart() {
		System.out.println(brand+" 터치로 시동 켜기");
	}

	@Override
	public void engineStop() {
		System.out.println(brand+" 터치로 시동 끄기");		
	}
	
}
