package testing;

import static org.junit.Assert.*;

import org.junit.Test;

public class division {

	@Test
    public void testDivison() {
			JunitTesting div=new JunitTesting();
			try {
				int result = div.divison(10, 2);

				assertEquals(5, result);
			} catch (Exception e) {
				e.printStackTrace(System.err);
			}
		}

		@Test(expected = Exception.class)
		public void testDivisionException() throws Exception {
			JunitTesting div2=new JunitTesting();
			div2.divison(10, 0);
		}
	}


