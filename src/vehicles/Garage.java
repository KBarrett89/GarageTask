package vehicles;

import java.util.ArrayList;

public class Garage {

	private ArrayList<Vehicle> vehicles = new ArrayList<>();

	public void add(Vehicle Vehicle) {
		this.vehicles.add(Vehicle);
	}

	public void remove(Vehicle Vehicle) {
		this.vehicles.remove(Vehicle);
	}

	public void print() {
		for (int i = 0; i < this.vehicles.size(); i++) {
			vehicles.get(i).finalPrint();

		}
	}

	public Vehicle findBylicencePlate(String licencePlate) {
		for (int i = 0; i < this.vehicles.size(); i++) {
			if (this.vehicles.get(i).getlicencePlate() == licencePlate) {
				return this.vehicles.get(i);
			}
		}
		return null;
	}

	public double calcBill() {
		double bill = 0;

	}
}
