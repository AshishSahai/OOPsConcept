package Abstract;

public class IDBI implements UsBank{

	@Override
	public void Credit() {
		// TODO Auto-generated method stub
		System.out.println("Credit Money");		
		
	}

	@Override
	public void Debit() {
		// TODO Auto-generated method stub
		System.out.println("Debit Money");	
		
	}

	@Override
	public void OnlineTransfer() {
		// TODO Auto-generated method stub
		System.out.println("Transfer Money");
		
	}
	public void BankSecurity() {
		System.out.println("Security");
	}
	
	void Crypto() {
		System.out.println("Bitcoin");
	}


}
