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

		// getters and setters for num and seats
	}

	@Override
	public void communicate() {
		System.out.println("Waaaahhhhh");
	}
}