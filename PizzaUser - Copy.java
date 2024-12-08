package AtmApplication;

import java.util.Scanner;

public class PizzaUser {
	
	public static void main(String[] args) {
		PizzaDummyClass pdc =new PizzaDummyClass();
		Pizza p=new Pizza(0, 0, 0, 0, 0, 0, 0, 0);
		int addedd=0;
		boolean b=true;
		Scanner sc=new Scanner(System.in);
		System.out.println("WELCOME TO PIZZA HUT ");
		System.out.println("WOULD YOU LIKE TO SEE MENU: ");
		String ans =sc.nextLine();
		if(ans.equalsIgnoreCase("Yes")) {
			System.out.println("Here Our Menu is: ");
			System.out.println(p);
			do {
				System.out.println("WOULD YOU LIKED TO PURCHASE ENTER THE NUMBER: :");
				int num =sc.nextInt();
				System.out.println("WOULD YOU LIKE TO PURCHASE:");
				String ans1=sc.next();
				if(ans1.equalsIgnoreCase("Yes")) {
					System.out.println("WPULD YOU LIKE TO ADD EXTRA CHEESE (Rs.50/-");
					String reply =sc.next();
					if(reply.equalsIgnoreCase("Yes")) {
						 addedd =pdc.extracheese();	
					}System.out.println("WOULD YOU LIKE TO ADD EXTRA TOPPINGS: ");
					String ans2= sc.next();
					if(ans2.equalsIgnoreCase("yes")){
						addedd=pdc.extratopping();
					}
					System.out.println("Enter the amount avalible :");
					double amt =sc.nextDouble();
					amt = amt-addedd;
					pdc.withdrawl(num, amt);
					b=false;
					System.out.println("THANKYOU VISIT AGAIN");
				}else {
					System.out.println("Would you like to see menu again:");
					String ans3=sc.next();
					if(ans3.equalsIgnoreCase("yes")) {
						System.out.println("Welcome again: ");
						System.out.println(p);
					}else {
						System.err.println("Thank you visit again: ");
						b=false;
					}
				}
			}while(b);
		}else {
			System.out.println("Thank You for Choosinng Pizza huttt ; Visit Us Again: ");
			System.out.println();
		}
	}
}
