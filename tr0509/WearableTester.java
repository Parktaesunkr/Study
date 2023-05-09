package tr0509;

public class WearableTester {

	public static void main(String[] args) {
		Wearable[] a = new Wearable[2];
		a[0] = new Headphone();
		a[1] = new WearableComputer();
		
		for(int i = 0; i < a.length ; i++)
			a[i].putOn();
		
		for(int i = 0; i <a.length; i++)
			a[i].putOff();

	}

}
