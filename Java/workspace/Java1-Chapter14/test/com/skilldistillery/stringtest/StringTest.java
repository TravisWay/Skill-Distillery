package com.skilldistillery.stringtest;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.sun.org.apache.xml.internal.resolver.helpers.PublicId;

import sun.security.util.Length;

public class StringTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test_CharAt_returns_character_at_index() {
		String tester = "abcde";
		assertEquals('a', tester.charAt(0));
		assertEquals('e', tester.charAt(4));
		
	}
	@Test
	public void test_CharAt_throws_IndexOutOfBounds_for_negative_or_notless_than_Length_of_string(){
	try {
		String tester = "0123";
		tester.charAt(4);
		fail("Should have thrown exception here");
	} catch (IndexOutOfBoundsException e) {
		// TODO: handle exception
		
		
	}
		
		
	}
	@Test
	public void test_Concat(){
		String tester = "abc";
		String tester2 = "def";
		assertEquals("abcdef",tester.concat(tester2));
		
		
	}
	@Test
	public void test_contains(){
		String tester = "abc";
		assertEquals(true,tester.contains("a"));
		
		
	}
	
	@Test
	public void test_contains_if_String_is_null_throws_NullPointerException(){
		try {
			String tester= null;
			tester.contains("a");
			fail("Should have thrown a Null Pointer Exception");
		} catch (NullPointerException e) {
			// TODO: handle exception
		}
		
		
	}
	@Test
	public void testendsWith(){
		String tester = "abcd";
		assertEquals(true,tester.endsWith("d"));
		
		
		
	}
	@Test
	public void testindexOf(){
		String tester ="abcd";
		assertEquals(2, tester.indexOf("c"));
		
	}
	@Test
	public void testisEmpty(){
		String tester ="abcd";
		assertEquals(false, tester.isEmpty());
		
	}
	
	
	
	
	
	
}
