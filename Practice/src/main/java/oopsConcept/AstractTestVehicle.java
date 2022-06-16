package oopsConcept;

public class AstractTestVehicle extends AbstractVehicle {
public void car() {
	System.out.println("This is Smooth Journey Vehicle");
}
public static void main(String[] args) {
	
	AstractTestVehicle atv = new AstractTestVehicle();
	atv.Bike();
	atv.car();
	atv.Lorry();
	
}

}
