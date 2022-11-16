package jUnitTestPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddNumbers {

	@Test
	public void test() {
		jUnitFunctions obj = new jUnitFunctions();
		int a = 10;
		int b = 10;
		assertEquals(20,obj.add_num(a, b));

	}

	@Test
	public void test1() {
		jUnitFunctions obj = new jUnitFunctions();
		int a = 10;
		int b = 10;
		assertEquals(10,obj.add_num(a, b));

	}
}
