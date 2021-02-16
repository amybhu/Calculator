package testing;

import static org.junit.Assert.*;

import org.junit.Test;

public class squareTest {

	@Test
	public void test() {
		JunitTesting test=new JunitTesting();
		int output=test.sqr(7);
		assertEquals(49,output);
	}
	
}
