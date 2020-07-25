package com.epam.JunitTDD;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.TestCase;

public class Removing_AATest extends TestCase {
	Removing_AA raa=new Removing_AA();
	@Test
	public void test1() {
		assertEquals("BCD", raa.StringRefactor("ABCD"));
	}

	@Test
	public void test2() {
		assertEquals("CD", raa.StringRefactor("AACD"));
	}
	
	@Test
	public void test3() {
		assertEquals("BCD", raa.StringRefactor("BACD"));
	}
	
	@Test
	public void test4() {
		assertEquals("BBAA", raa.StringRefactor("BBAA"));
	}
	
	@Test
	public void test5() {
		assertEquals("BAA", raa.StringRefactor("AABAA"));
	}
	
	@Test
	public void test6() {
		assertEquals("", raa.StringRefactor(""));
	}
	
	@Test
	public void test7() {
		assertEquals("", raa.StringRefactor("A"));
	}
	
	@Test
	public void test8() {
		assertEquals("B", raa.StringRefactor("B"));
	}
	
	@Test
	public void test9() {
		assertEquals("B", raa.StringRefactor("AB"));
	}
	
	@Test
	public void test10() {
		assertEquals("B", raa.StringRefactor("BA"));
	}
	
	@Test
	public void test11() {
		assertEquals("ABCDEFGHI", raa.StringRefactor("AAABCDEFGHI"));
	}
}