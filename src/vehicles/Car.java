package vehicles;

public class Car extends Vehicle {

	private boolean sunRoof;

	public Car(boolean sunRoof, int numberOfWheels, int numberOfDoors, String colour, String licencePlate) {

		super(numberOfWheels, numberOfDoors, colour, licencePlate);
		this.sunRoof = sunRoof;

	}

	public String sunRoof() {
		if (sunRoof == true) {
			return "Sunroof";
		} else {
			return "No Sunroof";
		}

	}

	public boolean getsunRoof() {
		return sunRoof;
	}

	public void sunRoof(boolean sunRoof) {
		this.sunRoof = sunRoof;
	}

	@Override
	public void communicate() {
		System.out.println("Honk");
	}

	@Override
	public void addPrint() {
		System.out.println(sunRoof());
	}

	public double calcBill() {
		return (getnumberOfWheels() * 50);
}