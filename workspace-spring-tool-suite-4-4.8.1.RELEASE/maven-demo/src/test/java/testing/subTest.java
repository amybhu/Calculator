package testing;

import static org.junit.Assert.*;

import org.junit.Test;

public class subTest {

	@Test
	public void test() {
		JunitTesting obj=new JunitTesting();
		int result =obj.subtraction(9,6);

		assertEquals(3, result);
	}

}
