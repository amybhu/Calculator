package testing;

import static org.junit.Assert.*;

import org.junit.Test;

public class multiplyTest {

	@Test
	public void test() {
		JunitTesting mul=new JunitTesting();
		int result =mul.multiplication(3, 4);

		assertEquals(12, result);
	}

}
