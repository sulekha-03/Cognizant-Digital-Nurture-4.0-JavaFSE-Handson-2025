package tests;

import static org.junit.Assert.*;

import org.junit.Test;

public class testingUnit {

	@Test
	public void test() {
		utest obj1 =new utest();
		int out=obj1.square(4);
		
		assertEquals(16,out);
		assertEquals(true,obj1.palindrome(12321));
		assertEquals(false,obj1.palindrome(45674));
	}

}
