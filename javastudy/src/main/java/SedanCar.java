/**
 * 豪华小轿车
 */
public class SedanCar extends Car {

	public String smallTrunk;

	public SedanCar() {
		super();
		System.out.println("我是小轿车");
	}

	@Override
	public void run1() {
		System.out.println("我是子类的方法");
	}
}
