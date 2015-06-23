


public class Main {
	public static void main(String[] args) {
		

		Rechnung rechnung1 = new Rechnung();
		rechnung1.add("Hammer", 7.99f);
		rechnung1.add("Nagel", 3.99f);
		rechnung1.add("Bohrer", 53.99f);
		rechnung1.setDruckStrategie(new HTML());
		rechnung1.drucken();
		
		System.out.println("");
		
		Rechnung rechnung2 = new Rechnung();
		rechnung2.add("Hammer", 7.99f);
		rechnung2.add("Nagel", 3.99f);
		rechnung2.add("Bohrer", 53.99f);
		rechnung2.setDruckStrategie(new Text());
		rechnung2.drucken();
	}
}
