import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import Test.DivisionTest;
import Test.MultiplicacionTest;
import Test.RestaTest;
import Test.SumaTest;

@RunWith(Suite.class)
@SuiteClasses({
	DivisionTest.class,
	MultiplicacionTest.class,
	RestaTest.class,
	SumaTest.class,
})
public class AllTests {

}
