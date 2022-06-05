package Abstract;

import static Abstract.UsBank.min_bal;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IDBI t = new IDBI();
		t.Crypto();
		t.BankSecurity();
		
		
		UsBank u = new IDBI();
		u.Credit();
		u.OnlineTransfer();
		System.out.println(min_bal);
		
		
		
		

	}

}
