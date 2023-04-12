package abstraction;

public class Child implements Interface_People, Governmant, Child2 {

	@Override
	public void gstTax() {
	System.out.println("5% increased");	
		
	}

	@Override
	public void roadTax() {
    System.out.println("10% increased");
		
	}

	@Override
	public void petrolCostPerLiter() {
	System.out.println("Rs100 per liter ");	
		
	}

	@Override
	public void mobile() {
	System.out.println("Samsung S6");	
		
	}

	@Override
	public void restarant() {
	System.out.println("Accord pondycherry ");	
		
	}

	@Override
	public void cinema() {
	System.out.println("vikram");	
		
	}

	@Override
	public void q() {
		
		
	}

	@Override
	public void a() {
		
		
	}

	public static void main(String[] args) {
		
		Child obj = new Child ();
		
		obj.gstTax();
		obj.roadTax();
		obj.petrolCostPerLiter();
		obj.mobile();
		obj.restarant();
		obj.cinema();
		
		
	}
	
	
}
