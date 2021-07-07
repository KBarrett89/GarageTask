package vehicles;

public static void main(String[] args) {

		ArrayList<Vehicle> vehincles = new ArrayList<>();

		vehicles.add(new Car(4, 2, "red", "DY7 5FG"));
		vehicles.add(new Car(4, 4, "grey", "LP9 6CS"));
		vehicles.add(new Car(3, 2, "green", "Y78 5TG"));
		vehicles.add(new Car(4, 4, "white", "AF5 7TH"));

		vehicles.add(new Motorbike(2, 0, "black", "FG56 0TT"));
		vehicles.add(new Motorbike(2, 0, "red", "BV1 2DE"));
		vehicles.add(new Motorbike(3, 0, "silver", "LI8 5BV"));
		vehicles.add(new Motorbike(2, 0, "yellow", "CX5 3OL"));

		vehicles.add(new Aeroplane(32, 5, "rainbow", "N71L10"));
		vehicles.add(new Aeroplane(24, 4, "white", "L64B78"));
		vehicles.add(new Aeroplane(16, 2, "white", "N90N34"));
		vehicles.add(new Aeroplane(24, 4, "red", "C56T98"));

		}
}
