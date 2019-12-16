package com.bytehonor.sdk.builder.html.error;

import static org.junit.Assert.*;

import org.junit.Test;

import com.bytehonor.sdk.builder.html.error.HtmlSdkException;

public class HtmlSdkExceptionTest {

    @Test
    public void testGetCode() {
        HtmlSdkException se = new HtmlSdkException("test");

        assertTrue("testGetCode should return 'true'", "test".equals(se.getMessage()));
    }

}
