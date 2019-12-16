package com.bytehonor.sdk.builder.html.error;

import static org.junit.Assert.*;

import org.junit.Test;

import com.bytehonor.sdk.builder.html.error.StandardException;

public class StandardExceptionTest {

	@Test
	public void testGetCode() {
		int code = 1;
		StandardException se = new StandardException(code, "test");

		assertTrue("testGetCode should return 'true'", se.getCode() == code);
	}

}
