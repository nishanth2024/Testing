package polymorpisumdataoverriding;

public class Customer3 extends BankDepositeChallan {

	@Override
	public void date(String dt) {
		
		super.date(dt);
	}

	@Override
	public void applicantsName(String name) {
		
		super.applicantsName(name);
	}

	@Override
	public void address(String name) {
		
		super.address(name);
	}

	@Override
	public void purposeOfRemittance(String name) {
		
		super.purposeOfRemittance(name);
	}

	@Override
	public void accountNo(int numberName) {
		
		super.accountNo(numberName);
	}

	@Override
	public void beneficiaryName(String name) {
		
		super.beneficiaryName(name);
	}

	@Override
	public void beneficiaryAddress(String name) {
		
		super.beneficiaryAddress(name);
	}

	@Override
	public void beneficiaryAccountNo(int number) {
		
		super.beneficiaryAccountNo(number);
	}

	@Override
	public void bank_Ifcs(String a, int b) {
		
		super.bank_Ifcs(a, b);
	}

	@Override
	public void amount(int amount) {
		
		super.amount(amount);
	}

	@Override
	public void signatureOfBankOfficial(String name) {
		
		super.signatureOfBankOfficial(name);
	}
 

	  public static void main(String[] args) {
			
			Customer1 obj = new Customer1 (); 
			obj.date("8/6/1980");
			obj.applicantsName("vijay");
			obj.address("NO.120 4rd Cross street, murugannager, pondycherry");
			obj.purposeOfRemittance("for business purpose only");
			obj.accountNo(6467664);
			obj.beneficiaryName("ajith");
			obj.beneficiaryAddress("no. 9 sj street, ganesh nager, pondycherry");
			obj.beneficiaryAccountNo(5897478);
			obj.bank_Ifcs("IDFS", 9567);
			obj.amount(10000);
			obj.signatureOfBankOfficial("raguvaran");	
	
}
		
	
}
