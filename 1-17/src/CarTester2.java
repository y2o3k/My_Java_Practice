
public class CarTester2 {

	public static void main(String[] args) {
		Car car1 = new Car("W140",1885,1490,5220,95.0,new Day(2018,10,13));

		car1.putSpec(); 
		//사양표시
	}
}
	class ExCar extends Car{
		@override public void putSpec() {
			super.putSpec();
			System.out.printf("총 주행거리: %.2fkm\n", totalMileage);
		}
	}
