package testing;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ division.class, multiplyTest.class, squareTest.class, subTest.class, sumTest.class })
public class AllTests {

}
