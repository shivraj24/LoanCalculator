package PersonalLoan;

import java.util.*;
import java.lang.Math;

public class personal{
	long principle_amount;
	float interest =  (float)10/12/100;
	long tenure;
	public
	personal(long p,long t){
		principle_amount = p;
		tenure = t;
	}
	public long EMI_amount()
	{
		long res = 0;
		
		res =  (long) ((principle_amount *interest) * ( Math.pow(1+interest,tenure) / (Math.pow(1+interest, tenure) - 1)));
		
		return res;
		
		
	}
	
	public long total_payable_amount()
	{
		
		
		long emi = EMI_amount();
		
		long months = tenure;
		
		
		
		return (emi*months);
	}
	
}