package chapterOne;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class Dollar {
	int amount;
	
	Dollar(int amount){
		this.amount = amount;
	}
	
	Dollar times(int multiplier) {
		return new Dollar(amount * multiplier);
	}
	
	@Override
	public boolean equals(Object obj) {
		Dollar dollar = (Dollar) obj;
		return amount == dollar.amount;
	}
}

class MoneyTest {

	@Test
	void testMultiplication() {
		Dollar five = new Dollar(5);
		Dollar product = five.times(2);
		Assert.assertEquals(product.amount, 10);
		
		product = five.times(3);
		Assert.assertEquals(product.amount, 15);
	}

	@Test
	void testEquality() {
		Assert.assertTrue(new Dollar(5).equals(new Dollar(5)));
		Assert.assertFalse(new Dollar(5).equals(new Dollar(6)));
	}
}
