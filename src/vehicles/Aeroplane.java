package vehicles;

public class Aeroplane extends Vehicle {

	private int numberOfSeats;

	public Aeroplane(int numberOfSeats, int numberOfWheels, int numberOfDoors, String colour, String licencePlate) {

		// this.setnumberOfWheels(numberOfWheels);
		// this.setnumberOfDoors(numberOfDoors);
		// this.setColour(colour);
		// this.setlicencePlate(licencePlate);
		// line 15 = line 9 - 12

		super(numberOfWheels, numberOfDoors, colour, licencePlate);
		this.numberOfSeats = numberOfSeats;

	}

	public int getnumberOfSeats() {
		return numberOfSeats;
	}

	public void setnumberOfSeats(int numberOfSeats) {
		this.numberOfSeats = numberOfSeats;
	}

	@Override
	public void communicate() {
		System.out.println("Waaaahhhhh");
	}

	@Override
	public void addPrint() {
		System.out.println("Number of Steats" + numberOfSeats);
	}

	public double calcBill() {
		return (getnumberOfWheels() * 50);
}