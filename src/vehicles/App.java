package vehicles;

public class App{

public static void main(String[] args) {
	
Garage vehicles = new Garage();

		vehicles.add(new Car(true, 4, 2, "red", "DY7 5FG"));
		vehicles.add(new Car(false, 4, 4, "grey", "LP9 6CS"));
		vehicles.add(new Car(false, 3, 2, "green", "Y78 5TG"));
		vehicles.add(new Car(false, 4, 4, "white", "AF5 7TH"));

		vehicles.add(new Motorbike(true, 2, 0, "black", "FG56 0TT"));
		vehicles.add(new Motorbike(false, 2, 0, "red", "BV1 2DE"));
		vehicles.add(new Motorbike(false, 3, 0, "silver", "LI8 5BV"));
		vehicles.add(new Motorbike(true, 2, 0, "yellow", "CX5 3OL"));

		vehicles.add(new Aeroplane(120, 32, 5, "rainbow", "N71L10"));
		vehicles.add(new Aeroplane(80, 24, 4, "white", "L64B78"));
		vehicles.add(new Aeroplane(10, 16, 2, "white", "N90N34"));
		vehicles.add(new Aeroplane(20, 24, 4, "red", "C56T98"));
		
		vehicles.print();

		}



}
