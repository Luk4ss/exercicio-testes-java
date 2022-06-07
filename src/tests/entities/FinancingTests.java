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
	
	@Test
	public void constructorShouldCreateAnObjectWhenValidData() {
		double totalAmount = 100000.0;
		double income = 2000.0;
		int months = 80;
			
		Financing objectCreated = new Financing(totalAmount, income, months);
		
		Assertions.assertTrue(objectCreated != null);
	}
	
	@Test
	public void constructShouldThrowExceptionWhenInvalidData() {
		
		Assertions.assertThrows(IllegalArgumentException.class, () ->{
			double totalAmount = 100000.0;
			double income = 2000.0;
			int months = 20;
				
			new Financing(totalAmount, income, months);
		});
	}
	
	@Test
	public void setTotalAmountShouldBeUpdatedWhenDataIsValid() {
		
		double expectedValue = 100000.0;		
		Financing financing = new Financing(90000.0, 4000.0, 80);
		
		financing.setTotalAmount(100000.0);
		
		Assertions.assertEquals(expectedValue, financing.getTotalAmount());
		
	}
	
	@Test
	public void setTotalAmountShouldThrowExceptionWhenDataIsInvalid() {
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
		
			Financing  fn = new Financing(100000.0, 2000.0, 80);
			
			fn.setTotalAmount(120000.0);
			
		});
	}
	
	@Test
	public void setIncomeShouldUpdateWhenDataIsValid() {
		
		double expectedValue = 4000.0;
		
		Financing financing = new Financing(100000.0, 2000.0, 80);
		
		financing.setIncome(4000.0);
		
		Assertions.assertTrue(expectedValue == financing.getIncome());
		
		
		
	}

}
