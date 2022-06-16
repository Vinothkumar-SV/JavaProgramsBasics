package oopsConcept;

public class Finalize {

	public void finalize() {
		System.out.println("This is Finalize");

	}

	public static void main(String[] args) {
		Finalize fz = new Finalize();
		// Finalize fz1 = new Finalize();
		fz.finalize();
	}
}
