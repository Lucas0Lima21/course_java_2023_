package vehicle_heranca_interface;

public class Ferrari extends Car implements Accessory {
	private boolean turbo = false;

	public Ferrari(int speed, int speedMax) {
		super(speed, speedMax);
	}
	@Override
	public void onturbo() {
		turbo = true;
	}
	@Override
	public void offturbo() {
		turbo = false;

	}
	@Override
	public void accelerate() {
		if(turbo != false) {
			speed +=30;
		}else {
			speed +=15;
		}
	}

}
