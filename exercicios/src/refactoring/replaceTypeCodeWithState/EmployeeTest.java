package refactoring.replaceTypeCodeWithState;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class EmployeeTest {

	@Test
	void test() {
		Employee engineer1 = new Employee(0);
		
		Assert.assertEquals(engineer1.getTypeCode(), EmployeeType.ENGINEER);
	}

}
