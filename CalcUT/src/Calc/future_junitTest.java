// Abdullah AL-Sinaidi


package Calc;

import static org.junit.Assert.*;
import junit.framework.TestCase;

import org.junit.Test;

public class future_junitTest extends TestCase {

	@Test
	public void test_future() {
		Calculate test_future_val= new Calculate();
		assertEquals("Your future value has to be $26917.0", 26917.0,test_future_val.get_future(20000, 15, 2));
		assertEquals ("Your future value has to be $59693.0", 59693.0,test_future_val.get_future(30000, 20, 3.5));
		assertEquals ("Your future value has to be $17852.0", 17852.0,test_future_val.get_future(15000, 8, 2.2));
		assertEquals ("Your future value has to be $194603.0", 194603.0,test_future_val.get_future(60000, 30, 4));
		assertEquals ("Your future value has to be $14859.0", 14859.0,test_future_val.get_future(10000, 20, 2));
	}

}
