package AtmApplication;

public class PizzaDummyClass extends PizzaAbs {
	int added=0;
	Pizza pp=new Pizza(added, added, added, added, added, added, added, added);
	public int extracheese() {
		
		System.out.println("Extra Cheese added: ");
		added =added+pp.getExtracheese();
		return added;
		
		
	}

	public int extratopping() {
		System.out.println("Extra Toppings Addded: ");
		added=added+pp.getExtratopping();
		return added;
		
		
	}

	
	public void withdrawl(int choice, double amt) {
		switch(choice) {
		case 1:
			if(amt>=pp.getPizza()) {
				double balan=amt-pp.getPizza();
				System.out.println("Balance"+balan);
			}else {
				System.out.println("Insufficient Funds: ");
			}break;
		case 2:
			if(amt>=pp.getChickenpizza()) {
				double balan1=amt-pp.getChickenpizza();
				System.out.println("Balance"+balan1);
			}else {
				System.out.println("Insufficient Funds: ");
			}break;
		case 3:
			if(amt>=pp.getOnionpizza()) {
				double balan2=amt-pp.getOnionpizza();
				System.out.println("Balance"+balan2);
			}else {
				System.out.println("Insufficient Funds: ");
			}break;
		case 4:
			if(amt>=pp.getDoublecheesepizza()) {
				double balan3=amt-pp.getDoublecheesepizza();
				System.out.println("Balance"+balan3);
			}else {
				System.out.println("Insufficient Funds: ");
			}break;
		case 5:
			if(amt>=pp.getCheesepizza()) {
				double balan5=amt-pp.getCheesepizza();
				System.out.println("Balance"+balan5);
			}else {
				System.out.println("Insufficient Funds: ");
			}break;
		}
		
	}

}
