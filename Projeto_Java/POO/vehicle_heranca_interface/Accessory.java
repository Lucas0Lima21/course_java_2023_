package vehicle_heranca_interface;

public interface Accessory {
	 void onturbo();
	 void offturbo();
	 default int SpeedAir() {
		 return 1;
	 }

}
