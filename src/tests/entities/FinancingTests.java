package tests.entities;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import entities.Financing;

public class FinancingTests {
	
	@Test
	public void quotaShoudBeCorrect() {
		
		double totalAmount = 100000.0;
		double entry = 20000.0;
		int months = 80;
		
		double expectedValue = 1000.0;
		
		Financing fnc = new Financing(totalAmount, entry, months);
		
		Assertions.assertEquals(expectedValue, fnc.quota());
		
		
		
	}
}
