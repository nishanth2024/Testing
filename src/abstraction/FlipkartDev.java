

// abstract class



package abstraction;

public class FlipkartDev extends FlipkartDataBase {

	@Override
	public void user1Password() {
		
	System.out.println("password007");	
	}

	@Override
	public void user1Address() {
		System.out.println("no.408 rajaborder street rathanapalayam chennai -9");
		
	}

	@Override
	public void user1PhoneNo() {
	System.out.println("6473775656");	
		
	}

	
	public static void main(String[] args) {
		
	FlipkartDev	obj = new FlipkartDev ();
	obj.user1Name();
	obj.user1Password();
	obj.user1Address();
	obj.user1PhoneNo();	
	}
	
	
	
	
}
