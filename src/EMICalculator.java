import CarLoan.*;
import PersonalLoan.*;
import HomeLoan.*;

import java.util.*;

public class EMICalculator {

	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		
		System.out.println("Select the loan type :");
		System.out.println("1. Home Loan \n 2. Personal Laon \n 3.Car Loan");
		
		int choice = s.nextInt();
		
		
		System.out.println("Enter the Loan Amount");
		long amount = s.nextLong();

		System.out.println("Enter the tenure period");
		long tenure = s.nextLong();
		
		tenure = tenure *12;
		
		switch(choice)
		{
			
			case 1:
				
				home object1 = new home(amount,tenure);
				
				System.out.println("1. EMI \n 2.Total Payable Amount");
				int c1 = s.nextInt();
				switch(c1)
				{
					case 1:
						long emi = object1.EMI_amount();
						System.out.println("EMI : " + emi);
						break;
						
					case 2:
						long total_amount = object1.total_payable_amount();
						System.out.println("Total Amount to pay : " + total_amount);
						break;
				}
				
				break;
			case 2:
				 
				personal object2 = new personal(amount,tenure);

				System.out.println("1. EMI \n 2.Total Payable Amount");
				
				int c2 = s.nextInt();
				switch(c2)
				{
					case 1:
						long emi = object2.EMI_amount();
						System.out.println("EMI : " + emi);
						break;
						
					case 2:
						long total_amount = object2.total_payable_amount();
						System.out.println("Total Amount to pay : " + total_amount);
						break;
				}
				break;
			
			case 3:
				 
				car object3 = new car(amount,tenure); 

				System.out.println("1. EMI \n 2.Total Payable Amount");
				
				int c3 = s.nextInt();
				switch(c3)
				{
					case 1:
						long emi = object3.EMI_amount();
						System.out.println("EMI : " + emi);
						break;
						
					case 2:
						long total_amount = object3.total_payable_amount();
						System.out.println("Total Amount to pay : " + total_amount);
						break;
				}
				
				break;
				
		}
		
		
	}
		
}
