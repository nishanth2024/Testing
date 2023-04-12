package polymorpisumdataoverriding;

public class Customer1 extends BankDepositeChallan{

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
		obj.date("12/12/1970");
		obj.applicantsName("RAJINI");
		obj.address("NO.16 3RD Cross street, gandhinager, pondycherry");
		obj.purposeOfRemittance("for business purpose only");
		obj.accountNo(5432100);
		obj.beneficiaryName("kamal hassan");
		obj.beneficiaryAddress("no 2 vikram street, lokesh nager, pondycherry");
		obj.beneficiaryAccountNo(6654564);
		obj.bank_Ifcs("IDFS", 4235);
		obj.amount(60000000);
		obj.signatureOfBankOfficial("raguvaran");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
		
	}
	
	
	
	
	
	
	

