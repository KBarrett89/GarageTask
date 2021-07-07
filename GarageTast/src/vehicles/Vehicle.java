package vehicles;

public abstract class Vehicle {

	private int numberOfWheels;

	private int numberOfDoors;

	private String colour;

	private String licencePlate;

	public Vehicle() {
		super();
	}

	public Vehicle(int numberOfWheels, int numberOfDoors, String colour, String licencePlate) {
		super();
		this.numberOfWheels = numberOfWheels;
		this.numberOfDoors = numberOfDoors;
		this.colour = colour;
		this.licencePlate = licencePlate;

	}

	public abstract void communicate();

	public Integer getnumberOfWheels() {
		return numberOfWheels;
	}

	public void setnumberOfWheels(Integer numberOfWheels) {
		this.numberOfWheels = numberOfWheels;
	}

	public Integer getnumberOfDoors() {
		return numberOfDoors;
	}

	public void setnumberOfDoors(int numberOfDoors) {
		this.numberOfDoors = numberOfDoors;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public String getlicencePlate() {
		return licencePlate;
	}

	public void setlicencePlate(String licencePlate) {
		this.colour = licencePlate;
	}

	public void print() {
		System.out.println("Number of Wheels: " + this.numberOfWheels);
		System.out.println("Number of Doors: " + this.numberOfDoors);
		System.out.println("Colour: " + this.colour);
		System.out.println("Licence Plate: " + this.licencePlate);
		System.out.print("Horn Sound: ");
		this.communicate();
	}
}
