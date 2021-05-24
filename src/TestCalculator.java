
import org.junit.jupiter.api.Test;

import org.junit.Assert;

import CarLoan.*;
import PersonalLoan.*;
import HomeLoan.*;

class TestCalculator {

	@Test
	void test1() {
		long amount = 500000;
		long tenure = 2*12;
		home ob1 = new home(amount,tenure);
		
		Assert.assertEquals(ob1.EMI_amount(), 22386);
	}
	
	
	@Test
	void test2() {
		long amount = 500000;
		long tenure = 2*12;
		car ob1 = new car(amount,tenure);
		
		Assert.assertEquals(ob1.EMI_amount(), 23536);
	}
	
	
	@Test
	void test3() {
		long amount = 500000;
		long tenure = 2*12;
		personal ob1 = new personal(amount,tenure);
		
		Assert.assertEquals(ob1.EMI_amount(), 23072);
	}
	
	@Test
	void test4() {
		long amount = 500000;
		long tenure = 2*12;
		personal ob1 = new personal(amount,tenure);
		
		Assert.assertEquals(ob1.total_payable_amount(), 553728);
	}
	
	
	@Test
	void test5() {
		long amount = 500000;
		long tenure = 2*12;
		car ob1 = new car(amount,tenure);
		
		Assert.assertEquals(ob1.total_payable_amount(), 564864);
	}
	
	@Test
	void test6() {
		long amount = 500000;
		long tenure = 2*12;
		home ob1 = new home(amount,tenure);
		
		Assert.assertEquals(ob1.total_payable_amount(), 537264);
	}
}
