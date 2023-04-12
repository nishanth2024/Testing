package polymorpisumdataoverriding;

public class Customer4 extends BankDepositeChallan {

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
		
		Customer4 obj = new Customer4 ();
		
		obj.date("6/1/1990");
		obj.applicantsName("RAMANA");
		obj.address("NO.110 8rd Cross street, iyappan nager, pondycherry");
		obj.purposeOfRemittance("for business purpose only");
		obj.accountNo(4738230);
		obj.beneficiaryName("suja");
		obj.beneficiaryAddress("no. 7 latha street, lakshmi nager, pondycherry");
		obj.beneficiaryAccountNo(1432765);
		obj.bank_Ifcs("IDFS", 6206);
		obj.amount(60000);
		obj.signatureOfBankOfficial("raguvaran");	

	}
	
}
