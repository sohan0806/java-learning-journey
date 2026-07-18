package Abstraction;
interface LivingBeing {
	public void specialFeature();
}
class Fish implements LivingBeing {

	@Override
	public void specialFeature() {
		System.out.println("inside fish");
		
	}
	
}
class Bird implements LivingBeing {

	@Override
	public void specialFeature() {
		System.out.println("inside bird");
		
	}
	
}

public class MainLiving {

	public static void main(String[] args) {
		LivingBeing f1 = new Fish();
		LivingBeing b1 = new Bird();
		
		f1.specialFeature();
		b1.specialFeature();

	}

}
