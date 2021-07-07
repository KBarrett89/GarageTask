package vehicles;

public class Motorbike extends Vehicle {

	private boolean Sidecar;

	public Motorbike(boolean Sidecar, int numberOfWheels, int numberOfDoors, String colour, String licencePlate) {

		super(numberOfWheels, numberOfDoors, colour, licencePlate);
		this.Sidecar = Sidecar;

	}

	public String Sidecar() {
		if (Sidecar == true) {
			return "Sidecar";
		} else {
			return "No Sidecar";
		}

	}

	public boolean getSidecar() {
		return Sidecar;
	}

	public void Sidecar(boolean Sidecar) {
		this.Sidecar = Sidecar;
	}

	@Override
	public void communicate() {
		System.out.println("Boop");
	}

	@Override
	public void addPrint() {
		System.out.println(Sidecar());
	}

	public double calcBill() {
		return (getnumberOfWheels() * 50);
	}
}