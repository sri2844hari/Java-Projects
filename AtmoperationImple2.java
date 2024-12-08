package AtmApplication;

import java.util.HashMap;
import java.util.Map;

public class AtmoperationImple2 extends AtmOperationImpl{
	ATM atm  = new ATM();
	Map<Double ,String >mini=new HashMap<>();
	public void checkbalance() {
		System.out.println("Welcome to the View Balance Sectoin: "+atm.getBalance());
	}

	public void depositAmount(double depositAmount) {
		System.out.println("Welcome to deposit section: ");
		mini.put(depositAmount, "Amount deposited  ");
		System.out.println(depositAmount+"deposited Succesfully:");
		atm.setDeposit(atm.getBalance()+depositAmount);
		checkbalance();
		
	}

	
	public void withdrawlAmount(double withdrawlAmount) {
		System.out.println("Welcome to the Withdrawk Secrtion: ");
		if(withdrawlAmount%500==0) {
			if(withdrawlAmount<=atm.getBalance()) {
				mini.put(withdrawlAmount, "Withdrawl amount");
				System.out.println(withdrawlAmount+" Withdrawl anount auccesfully: ");
				atm.setWithdrawl(atm.getBalance()-withdrawlAmount);
				checkbalance();
			}else {
				System.out.println("Insufficient Funds:");
			}
		}else {
			System.out.println("Please enter 500 rs only : ");
		}
		
	}

	
	public void viewminiStatement() {
		for(Map.Entry<Double,String>m :mini.entrySet()) {
			System.out.println("Key things: "+m.getKey()+" Key Values Are: "+m.getValue());
		}
	}

}
