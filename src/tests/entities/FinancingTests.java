package tests.entities;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import entities.Financing;

public class FinancingTests {
	
	@Test
	public void quotaShoudBeCorrect() {
		
		double totalAmount = 100000.0;
		double income = 2000.0;
		int months = 80;
		
		double expectedValue = 1000.0;
		
		Financing financing = new Financing(totalAmount, income, months);
		
		Assertions.assertEquals(expectedValue, financing.quota());
		
	}
	
	@Test
	public void entryShoudBeCorrect() {
		double totalAmount = 100000.0;
		double income = 2000.0;
		int months = 80;
		
		double expectedValue = 20000.0;
		
		Financing financing = new Financing(totalAmount, income, months);
		
		Assertions.assertEquals(expectedValue, financing.entry() );
		
		
	}

}
