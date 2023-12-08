package vehicle_heranca_interface;

public class Car {
	protected int  speed;
	protected final int speedMax;

	public Car(int speed, int speedMax) {
		this.speed = speed;
		this.speedMax = speedMax;
	}
	
	public void accelerateSpeed(int speed) {
		if(( this.speed + speed ) <= speedMax) {
			this.speed +=speed;
		}else {
			System.out.println("A velocidade ira passar do limite, Entao não foi alterada.");
		}
	}
	public void brakeSpeed(int speed) {
		if(( this.speed - speed ) >= 0) {
			this.speed -=speed;
		}else {
			this.speed -=0;		
		}
	}
	
	public void accelerate() {
		if(( this.speed + 5 ) <= speedMax) {
			this.speed +=5;
		}else {
			System.out.println("A velocidade ira passar do limite, Entao não foi alterada.");
		}
	}
	
	public void brake() {
		if(( this.speed - 5 ) >= 0) {
			this.speed -=5;
		}else {
			this.speed -=0;
		}
	}
	public String toString() {
				return "O veiculo esta com a velocidade de :" + getSpeed();
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

}
