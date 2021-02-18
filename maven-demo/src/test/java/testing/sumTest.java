package testing;

import static org.junit.Assert.*;

import org.junit.Test;

public class sumTest {

	@Test
	public void test() {
		JunitTesting add=new JunitTesting();
		int result =add.sum(3, 4);

		assertEquals(7, result);
	}

}
