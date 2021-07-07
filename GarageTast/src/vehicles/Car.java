package vehicles;

public class Car extends Vehicle {

	public Car(int numberOfWheels, int numberOfDoors, String colour, String licencePlate) {

		this.setnumberOfWheels(numberOfWheels);
		this.setnumberOfDoors(numberOfDoors);
		this.setColour(colour);
		this.setlicencePlate(licencePlate);

	}

	@Override
	public void communicate() {
		System.out.println("Honk");
	}
}