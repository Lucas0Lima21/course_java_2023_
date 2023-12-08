package vehicle_heranca_interface;

public class Car_Test {
	public static void main(String[] args) {
		Civic vehicli1 = new Civic(0,180);
		Ferrari vehicli2 = new Ferrari(0,250);
		
		// so, a speed test:
		
		vehicli1.accelerateSpeed(100);
		vehicli2.accelerateSpeed(100);
		
		System.out.println(vehicli1);
		System.out.println(vehicli2 + "\n");
		
		vehicli1.accelerate();
		vehicli2.accelerate();
		
		System.out.println(vehicli1);
		System.out.println(vehicli2 + "\n");
		
		// With turbo:
		vehicli2.onturbo();

		vehicli1.accelerate();
		vehicli2.accelerate();
		
		System.out.println(vehicli1);
		System.out.println(vehicli2 + "\n");
		
		// off turbo:
		vehicli2.offturbo();

		vehicli1.accelerate();
		vehicli2.accelerate();
		
		System.out.println(vehicli1);
		System.out.println(vehicli2 + "\n");
		
		vehicli1.brakeSpeed(50);
		vehicli2.brakeSpeed(70);
		
		System.out.println(vehicli1);
		System.out.println(vehicli2 + "\n");
		
		vehicli1.brake();
		vehicli2.brake();
		
		System.out.println(vehicli1);
		System.out.println(vehicli2);
		
		System.out.println("air : " + vehicli2.SpeedAir() );
	}

}
