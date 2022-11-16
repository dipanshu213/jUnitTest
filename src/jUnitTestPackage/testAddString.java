package jUnitTestPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddString {

	@Test
	public void test() {
		jUnitFunctions obj = new jUnitFunctions();
		String a = "qwe";
		String b = "zxc";
		assertEquals("qwezxc",obj.add_str(a, b));
		
	}
	@Test
	public void test1() {
		jUnitFunctions obj = new jUnitFunctions();
		String a = "qwe";
		String b = "zxc";
		assertEquals("qwezx",obj.add_str(a, b));
		
	}

}
